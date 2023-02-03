import styled from "styled-components";

export const ExerciseButton = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;

  width: 15vw;
  height: 20vh;

  line-height: 30px; // 줄 간격
  border: 1px solid ${props => props.color};
  margin: 1em;
`;
