import { Routes, Route, useNavigate } from "react-router-dom";
import Home from "pages/Home";
import Dietetics from "pages/Dietetics";
import Exercise from "pages/Exercise";
import Today from "pages/Exercise/Today";
import Routine from "pages/Exercise/Routine";
import RoutineInfo from "pages/Exercise/RoutineInfo";
import Select from "pages/Exercise/Select";
import MyPage from "pages/MyPage";
import Workset from "pages/Exercise/Workset";

import TopBar from "components/TopBar";
import BottomNav from "components/BottomNav";
import { useEffect, useState } from "react";

// jsx
const App = () => {
  const [largeCategory, setLargeCategory] = useState("");
  const [subCategory, setSubCategory] = useState("");
  const [hidden, setHidden] = useState(false);
  const [navValue, setNavValue] = useState(1);
  const navigate = useNavigate();

  useEffect(() => {
    if (navValue === 0) navigate("/dietetics");
    else if (navValue === 1) navigate("/");
    else if (navValue === 2) navigate("/exercise");
  }, [navValue]);

  return (
    <>
      <TopBar
        largeCategory={largeCategory}
        subCategory={subCategory}
        isHidden={hidden}
      />
      <Routes>
        <Route
          path="/"
          element={
            <Home
              setLargeCategory={setLargeCategory}
              setSubCategory={setSubCategory}
              setHidden={setHidden}
            />
          }
        />
        <Route
          path="/dietetics"
          element={
            <Dietetics
              setLargeCategory={setLargeCategory}
              setSubCategory={setSubCategory}
              setHidden={setHidden}
            />
          }
        />

        <Route
          path="/exercise/*"
          element={
            <Exercise
              setLargeCategory={setLargeCategory}
              setSubCategory={setSubCategory}
              setHidden={setHidden}
            />
          }>
          <Route
            path="today"
            element={<Today setSubCategory={setSubCategory} />}
          />
          <Route
            path="workset"
            element={<Workset setSubCategory={setSubCategory} />}
          />
          <Route
            path="routine/*"
            element={<Routine setSubCategory={setSubCategory} />}>
            <Route
              path="info"
              element={<RoutineInfo setSubCategory={setSubCategory} />}
            />
          </Route>
          <Route path="select" element={<Select />} />
        </Route>
        <Route
          path="/mypage"
          element={
            <MyPage
              setNavValue={setNavValue}
              setLargeCategory={setLargeCategory}
              setSubCategory={setSubCategory}
              setHidden={setHidden}
            />
          }
        />
      </Routes>
      <BottomNav navValue={navValue} setNavValue={setNavValue} />
    </>
  );
};

export default App;
