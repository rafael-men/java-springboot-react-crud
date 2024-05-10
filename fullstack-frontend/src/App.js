import './App.css';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import Navbar from './layout/Navbar';
import Home from './pages/Home';
import Footer from './layout/Footer';
import {BrowserRouter as Router,Routes,Route} from 'react-router-dom'
import AddUser from './users/AddUser'

function App() {
  return (
    <div className="App">
      <Router>
      <Navbar/>
      <Routes>
        <Route path='/' element={<Home/>}/>
        <Route path='/adduser' element={<AddUser/>}/>
      </Routes>
      </Router>
      <Footer/>
    </div>
  );
}

export default App;
