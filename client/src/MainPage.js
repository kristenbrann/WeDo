import React, { useState, useRef } from 'react';
import './MainPage.css';

const defaultTasks = [
  {
    description: 'Water the plants',
  },
  {
    description: 'Water the plants',
  },
  {
    description: 'Water the plants',
  },
  {
    description: 'Water the plants',
  },
];

const MainPage = () => {
  const [tasks, setTasks] = useState(defaultTasks);
  const [newTask, setNewTask] = useState('');
  const inputEl = useRef(null);

  /**
   * Managing the value of the new task input
   * @param e
   */
  const onChangeNewTask = (e) => {
    e.preventDefault();
    setNewTask(e.target.value);
  };

  /**
   * Listens for "enter" presses so submit the new task input
   * @param e
   */
  const onKeyPressNewTask = (e) => {
    if (e.charCode === 13 || e.keyCode === 13 || e.key === 'Enter') {
      e.preventDefault();
      e.stopPropagation();
      onAddNewTask(e);
    }
  };

  /**
   * Adds a new task to the task list. Re-focuses on input so user can keep adding.
   * @param e
   */
  const onAddNewTask = (e) => {
    e.preventDefault();
    const newTasks = tasks.concat([{
      description: newTask,
    }]);
    setTasks(newTasks);
    setNewTask('');
    inputEl.current.focus();
  };

  return (
      <div>
        <h1>Welcome to your todo list!</h1>
        {tasks.map(t => (
            <div className="task">
              <p className="title">{t.description}</p>
              <button className="complete">&#10004;</button>
            </div>
        ))}
        <div className="task">
        <input type="text" ref={inputEl} value={newTask} onKeyPress={onKeyPressNewTask} onChange={onChangeNewTask}/>
        <button onClick={onAddNewTask}>&#43;</button>
        </div>
      </div>
  );
};

export default MainPage;
