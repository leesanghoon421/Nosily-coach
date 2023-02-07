import styled from "styled-components";

export const Container = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center; // 가로축 중앙 정렬
  gap: 20px;

  margin-top: 25px;
`;

export const SubTitle = styled.div`
  font-size: 18px;
  font-weight: bold;
`;

export const GoalBox = styled.div`
  width: 90vw;
  height: 130px;

  margin-top: 8px;

  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  border-radius: 10px;
`;

export const ContentsBox = styled.div`
  width: 90vw;
  height: 60px;

  margin-top: 5px;

  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  border-radius: 10px;
`;
