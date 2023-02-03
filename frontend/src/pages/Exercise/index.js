import { useState } from "react";
import * as styled from "./style.js";
import ExerciseButton from "components/ExerciseButton";
import { useLocation, Outlet } from "react-router-dom";

const buttonAttribute = [
  {
    color: "red",
    part: "스쿼트",
  },
  {
    color: "blue",
    part: "플랭크",
  },
  {
    color: "green",
    part: "러닝",
  },
  {
    color: "red",
    part: "어깨",
  },
  {
    color: "blue",
    part: "하체",
  },
];

const Excercise = () => {
  const [운동주제, set운동주제] = useState("헬스");
  const [총운동시간, set총운동시간] = useState(0);
  const location = useLocation();
  const currentUrl = location.pathname;

  return (
    <div>
      <styled.Pointblock>
        <h2>🏃‍♂️{운동주제}</h2>
      </styled.Pointblock>

      <styled.Block>
        <div>총 운동시간</div>
        <div>{총운동시간}초</div>
      </styled.Block>

      {currentUrl != "/exercise" ? (
        <>
          <Outlet />
        </>
      ) : (
        <styled.ExerciseContainer>
          {buttonAttribute.map((element) => (
            <ExerciseButton color={element.color} part={element.part} />
          ))}
        </styled.ExerciseContainer>
      )}
    </div>
  );
};

export default Excercise;
