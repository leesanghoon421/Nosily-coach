import { useState } from "react";
import * as styled from "./style.js";
import { Link } from "react-router-dom";

const ExerciseButton = ({ color, part }) => {
  const [운동시간, set운동시간] = useState(0);
  const [목표달성, set목표달성] = useState(0);

  return (
    <>
      <Link to="timer">
        <styled.ExerciseButton color={color}>
          <div>{part}</div>
          <div>{운동시간}</div>
          <div>{목표달성}</div>
        </styled.ExerciseButton>
      </Link>
    </>
  );
};
export default ExerciseButton;
