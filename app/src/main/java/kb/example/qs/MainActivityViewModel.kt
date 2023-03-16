package kb.example.qs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.*

class MainActivityViewModel(): ViewModel() {
    private val _stateFlow = MutableStateFlow(MainActivityUiState.Success(true))
    val uiState: StateFlow<MainActivityUiState> = _stateFlow.asStateFlow()
    .stateIn(
        scope = viewModelScope,
        initialValue = MainActivityUiState.Loading,
        started = SharingStarted.WhileSubscribed(5_000),
    )
}

sealed interface MainActivityUiState {
    object Loading : MainActivityUiState
    data class Success(val isOk: Boolean) : MainActivityUiState
}