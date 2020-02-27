import React from 'react';
import {
  BrowserRouter as Router,
  Switch,
  Route,
  useParams,
  Redirect
} 
from "react-router-dom";
import './App.css';

function App() {
  return (
    <Router basename = "/">
      <Switch>
        <Route exact path="/">
          <About />
        </Route>
        <Route path="/list/:id" >
          <MainPage/>
        </Route>
      </Switch>
    </Router>
  );

  function About() {
    var redirectURL = "/list/" + "12345678"
    return (
      <Redirect to={redirectURL}/>
    )
  }

  function MainPage() {
    let { id } = useParams();
    return (
      <h1>{id}</h1>
    )
  }
}

export default App;
