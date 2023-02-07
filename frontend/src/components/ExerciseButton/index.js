import { useState } from "react";
import * as styled from "./style.js";
import { Link } from "react-router-dom";

const ExerciseButton = ({ color, part }) => {
  const [운동시간, set운동시간] = useState(0);
  const [목표달성, set목표달성] = useState(0);

  return (
    <>
      <Link to="timer">  
      {/* 버튼을 클릭하면 timer 페이지로 이동 */}
        <styled.ExerciseButton color={color}> 
        {/* color prop을 전달하여 버튼 색상을 지정 */}
          <div>{part}</div> 
          <div>{운동시간}</div>
          <div>{목표달성}</div>
        </styled.ExerciseButton>
      </Link>
    </>
  );
};
export default ExerciseButton;
