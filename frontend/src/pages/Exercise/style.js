import styled from "styled-components";

export const Timerblock = styled.div``;


export const Pointblock = styled.div`
  display: flex;
  align-items: flex-end;
  justify-content: flex-start;
  padding-bottom: 16px;
  padding-left: 16px;

  width: 360px;
  height: 128px;

  left: 0px;
  top: 0px;
  background: #1e90ff;
  text-align: left;
  font-size: 26px;
  color: white;
  font-family: "Spoqa Han Sans Neo";
  
`;

export const Block = styled.div`
  display: flex;
  justify-content: center;
  align-items: center;
  width: 320px;
  height: 77px;
  margin: 0 auto;
  margin-top: 1em;

  background: #fdfeff;
  box-shadow: 0px 2px 4px rgba(0, 0, 0, 0.25);
  border-radius: 16px;
`;

export const ExerciseContainer = styled.div`
 position: absolute;
width: 320px;
height: 363px;
left: 20px;
top: 315px;

background: #FFFFFF;
box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
border-radius: 10px;
font-family: "Spoqa Han Sans Neo";
`;

export const AddButton = styled.div`
 
position: absolute;
width: 278px;
height: 25px;
left: 39px;
top: 692px;

background: #1E90FF;
box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
border-radius: 50px;
margin-top: 1em;
text-align: center;
color: white;
`;

export const DateContainer = styled.div`
  display: flex;
  flex-direction: row;
  
  justify-content: center;
  align-items: center;
  width: 131px;
  height: 25px;
  left: 116px;
  top: 287px;
  margin: 0 auto;
  margin-top: 1em;
  font-style: normal;
  font-weight: 400;
  font-size: 20px;
  line-height: 25px;
`;
export const NextButton = styled.button`
  background-color: white;
  border : white;
  padding-left: 10px; 
  font-size: 20px; 
  cursor: pointer;
  margin-right: 10px;
  margin-left: 10px;
`;
