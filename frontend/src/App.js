import { Routes, Route } from "react-router-dom";
import "./App.css";
import Dietetics from "./pages/Dietetics";
import Exercise from "./pages/Exercise";
import Timer from "pages/Exercise/Timer";

// jsx
const App = () => {
  return (
    <>
      {/* <Header /> */}
      <Routes>
        <Route path="/" element={<Dietetics />} />
        <Route path="/exercise/*" element={<Exercise />}>
          <Route path="timer" element={<Timer />} />

        </Route>
      </Routes>
    </>
  );
};

export default App;
