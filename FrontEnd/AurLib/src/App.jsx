import { useState, useEffect } from "react";
import "./App.css";
import { AddComp } from "./compnents/Books/AddBooks.jsx";
import { Routes, Route } from "react-router-dom";
import { Home } from "./compnents/Layout/Home.jsx";
import { Layout } from "./compnents/Layout/Layout.jsx";

function App() {
  const [books, setBooks] = useState([]);

  async function getBooks() {
    const response = await fetch("http://localhost:8080/books");

    setBooks(await response.json());
  }

  useEffect(() => {
    getBooks();
  }, []);

  return (
    <div className="App">
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route path="/books" element={<Home books={books} />} />
        </Route>
      </Routes>
    </div>
  );
}

export default App;
