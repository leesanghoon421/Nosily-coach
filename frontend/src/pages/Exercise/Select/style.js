import styled from "styled-components";
import { Link } from "react-router-dom";

export const Container = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center; // 가로축 중앙 정렬
  gap: 20px;

  margin-top: 25px;
`;

export const Lable = styled(Link)`
  font-weight: bold;
  color: black;
`;

export const Contents = styled.div`
  color: var(--color-manatee);
`;

export const AddButton = styled(Link)`
  height: 26px;
  width: 26px;
  background-color: var(--color-dodger-blue); // 버튼 색상
  border: 0;
  border-radius: 50%;
  color: var(--color-cultured); // 버튼 내부 글자 색상

  font-size: 20px;
  text-align: center;
  text-decoration: none;

  align-self: flex-end;

  margin-left: 25vw;
`;
