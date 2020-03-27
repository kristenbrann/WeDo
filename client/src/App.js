import React from 'react';
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Redirect
} from "react-router-dom";
import './App.css';
import MainPage from './MainPage.js';
import shortid from "shortid";

const CreateList = () => {
  const id = shortid.generate();
  const redirectURL = `/list/${id}`;
  return (
      <Redirect to={redirectURL}/>
  );
};

const App = () => (
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

export default App;
