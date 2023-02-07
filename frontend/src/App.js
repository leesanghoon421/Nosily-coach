import { Routes, Route } from "react-router-dom";
import Home from "pages/Home";
import Dietetics from "./pages/Dietetics";
import Exercise from "./pages/Exercise";
import Timer from "pages/Exercise/Timer";
import Stopwatch from "components/StopWatch/index";
import RestTime from "components/RestTime/index";
import Routine from "pages/Routine/index";
import InputRoutine from "pages/InputRoutine/index";

// jsx
const App = () => {
  return (
    <>
      {/* <Header /> */}
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/dietetics" element={<Dietetics />} />
        <Route path="/exercise/*" element={<Exercise />}>
          <Route path="timer" element={<Timer />} />
        </Route>
        <Route path="/routine/" element={<Routine />} />
        <Route path="/routineset/" element={<InputRoutine />} />
      </Routes>
    </>
  );
};

export default App;
