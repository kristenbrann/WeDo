import React from 'react';
import {
  BrowserRouter as Router,
  Switch,
  Route,
  useParams,
  Redirect
} from "react-router-dom";
import './App.css';
import MainPage from './MainPage.js';
import shortid from "shortid"

function App() {
  return (
    <Router basename = "/">
      <Switch>
        <Route exact path="/">
          <CreateList />
        </Route>
        <Route path="/list/:id" >
          <MainPage/>
        </Route>
      </Switch>
    </Router>
  );

  function CreateList() {
    var id = shortid.generate()
    var redirectURL = "/list/" + id
    return (
      <Redirect to={redirectURL}/>
    )
  }
}

export default App;
