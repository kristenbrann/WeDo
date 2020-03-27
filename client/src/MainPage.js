import React from 'react';
import './MainPage.css';

class MainPage extends React.Component{
  constructor(props) {
    super(props);
    this.state = {value: ''};

    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event) {
    this.setState({value: event.target.value});
  }

  handleSubmit(event) {
    console.log('Adding a task: ' + this.state.value);
    event.preventDefault();
  }

  
  render() {
    return (
      <div>
        <h1>Welcome to your todo list!</h1>
        <form onSubmit={this.handleSubmit}>
          <input type="text" value={this.state.value} onChange={this.handleChange} />
          <input id="addTask" type="submit" value="Add a WeDo" />
        </form>
      </div>
    );
  }
}

export default MainPage;
