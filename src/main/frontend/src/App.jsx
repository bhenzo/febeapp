import { Box, Card, CardContent, Container, FormGroup, Input, ThemeProvider, createTheme } from '@mui/material';
import './App.css';
import Button from '@mui/material/Button';
import DeleteIcon from '@mui/icons-material/Delete';

function App() {
	return (
		<Container>
			<Box>
				<Box flexDirection="row">
					<Box>
						<Button variant="contained">
							<DeleteIcon />
							&nbsp;Delete
						</Button>
					</Box>
					<Box m={2}>
						<Input placeholder="Ingrese coso"></Input>
					</Box>
				</Box>
			</Box>
		</Container>
	);
}

export default App;
