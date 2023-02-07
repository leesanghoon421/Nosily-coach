import { Routes, Route } from "react-router-dom";
import Home from "pages/Home";
import Dietetics from "./pages/Dietetics";
import Exercise from "./pages/Exercise";
import Timer from "pages/Exercise/Timer";

// jsx
const App = () => {
  return (
    <>
      {/* <Header /> */}
      <Routes>
        <Route path="/" element={<Home />}/>
        <Route path="/dietetics" element={<Dietetics />} />
        <Route path="/exercise/*" element={<Exercise />}>
          <Route path="timer" element={<Timer />} />

        </Route>
      </Routes>
    </>
  );
};

export default App;
