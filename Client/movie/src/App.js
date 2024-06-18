// src/App.js
import './App.css';
import api from './api/axiosConfig';
import { useState, useEffect } from 'react';

function App() {
  const [movies, setMovies] = useState([]);

  const getMovies = async () => {
    try {
      const response = await api.get('/api/v1/movies');
      console.log(response.data);
      setMovies(response.data);
    } catch (error) {
      console.error('Error fetching movies:', error);
    }
  };

  useEffect(() => {
    getMovies();
  }, []);

  return (
    <div className="App">
      {movies && movies.length > 0 ? (
        <ul>
          {movies.map((movie) => (
            <li key={movie.id}>{movie.title}</li>
          ))}
        </ul>
      ) : (
        <p>No movies found</p>
      )}
    </div>
  );
}

export default App;
