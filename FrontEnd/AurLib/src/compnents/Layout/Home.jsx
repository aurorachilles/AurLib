import React from "react";
import { AddComp } from "../Books/AddBooks.jsx";
import { AddNavBar } from "../Navigation/NavBar.jsx";
function Home({ books }) {
  return (
    <div>
      <AddNavBar></AddNavBar>
      {books.map((each) => {
        return <AddComp key={each.isbn} isbn={each.isbn}></AddComp>;
      })}
    </div>
  );
}

export { Home };
