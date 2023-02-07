import { Routes, Route } from "react-router-dom";
import Home from "pages/Home";
import Dietetics from "./pages/Dietetics";
import Exercise from "./pages/Exercise";
import Timer from "pages/Exercise/Timer";
import Routine from "pages/Routine/index";
import InputRoutine from "pages/InputRoutine/index";

import TopBar from "components/TopBar";
import BottomNav from "components/BottomNav";
import { useState } from "react";

// jsx
const App = () => {
  const [largeCategory, setLargeCategory] = useState("");
  const [subCategory, setSubCategory] = useState("");
  return (
    <>
      <TopBar largeCategory={largeCategory} subCategory={subCategory} />
      <Routes>
        <Route
          path="/"
          element={
            <Home
              setLargeCategory={setLargeCategory}
              setSubCategory={setSubCategory}
            />
          }
        />
        <Route path="/dietetics" element={<Dietetics />} />
        <Route path="/exercise/*" element={<Exercise />}>
          <Route path="timer" element={<Timer />} />
        </Route>
        <Route path="/routine/" element={<Routine />} />
        <Route path="/routineset/" element={<InputRoutine />} />
      </Routes>
      <BottomNav />
    </>
  );
};

export default App;
