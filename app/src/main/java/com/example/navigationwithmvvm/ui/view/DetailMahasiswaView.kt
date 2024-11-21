import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.navigationwithmvvm.model.Mahasiswa

@Composable
fun DetailMahasiswaView(
    uiState: Mahasiswa,
    onBackButton: () -> Unit)
{
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp))
    {
        TampilData(Param = "Nama", Argu = uiState.nama )
        TampilData(Param = "Jenis Kelamin", Argu = uiState.gender )
        TampilData(Param = "Alamat", Argu = uiState.alamat )
        TampilData(Param = "Email", Argu = uiState.email )
        TampilData(Param = "No Telepon", Argu = uiState.noHp )
        Button(onClick = onBackButton)
        {
            Text(text = "Kembali")
        }
    }
}
