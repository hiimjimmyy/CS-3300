import logo from './logo.svg';
import './App.css';
import {BrowserRouter, Routes, Route } from 'react-router-dom';
import Home from './views/Home';
import Nav from './componets/Nav';
import Footer from './componets/Footer';
import DisplayIssues from './componets/DisplayIssues';
import CreateIssuesModal from './componets/CreateIssuesModal';

function App()
{

  return (
    <div className="App">
    <Nav />
      <Routes>
          {/* <Route path="/" element={<CreateIssuesModal/>}> </Route> */}
          <Route path="/" element={<DisplayIssues/>}> </Route>
          <Route path="/" element={<Home/>}></Route>
      </Routes>
    <Footer />

    </div>
  );
}

export default App;
