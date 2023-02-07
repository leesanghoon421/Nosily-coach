import styled from "styled-components";
import { Link } from "react-router-dom";

export const Container = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center; // 가로축 중앙 정렬
  gap: 20px;

  margin-top: 25px;
`;

export const RoutineContainer = styled.div`
  width: 90vw;
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  border-radius: 10px;
  margin-top: 10px;
`;

export const BoxContents = styled(Link)`
  display: flex;
  gap: 10px;
  align-items: center;
  font-weight: medium;
  padding: 20px;
  border-bottom: 1px solid #dddddd;
  text-decoration: none;
  color: black;
`;
