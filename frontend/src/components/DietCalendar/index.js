import { useState, useQuery, useEffect } from "react";
import Calendar from "react-calendar";
import moment from "moment/moment.js";
import "react-calendar/dist/Calendar.css"; // css import
import * as styled from "./style.js";
import SubTitle from "components/SubTitle";

const DietCalendar = ({ setSubCategory }) => {
  const [value, onChange] = useState(new Date());

  const [음식목록들, set음식목록들] = useState([
    "계란말이",
    "닭가슴살",
    "김치찌개",
  ]);

  const [칼로리, set칼로리] = useState("0");

  const [mark, setMark] = useState([]);
  useEffect(() => {
    setMark(["2023-01-02", "2023-01-03", "2022-01-10"]);
  }, []);

  setSubCategory(`${value.getDate()}일에 먹은 식단`);

  return (
    <styled.Container>
      {/* <styled.CalenderContainer>
          <Calendar
            onChange={onChange}
            formatDay={(locale, date) => moment(date).format("DD")}
            value={value}
            className="mx-auto w-full text-sm border-b"
            tileContent={({ date, view }) => {
              if (mark.find((x) => x === moment(date).format("YYYY-MM-DD"))) {
                return (
                  <>
                    <div className="flex justify-center items-center absoluteDiv">
                      <styled.Dot></styled.Dot>
                    </div>
                  </>
                );
              }
            }}
          />
          </styled.CalenderContainer> */}
      <div>
        <SubTitle>오늘의 식단</SubTitle>
        <styled.TopContainer>
          <div>
            {" "}
            <styled.PointText>아침</styled.PointText> {음식목록들[0]}{" "}
          </div>
          <div>
            {" "}
            <styled.PointText>점심</styled.PointText> {음식목록들[1]}{" "}
          </div>
          <div>
            {" "}
            <styled.PointText>저녁</styled.PointText> {음식목록들[2]}{" "}
          </div>
        </styled.TopContainer>
      </div>
      <div>
        <SubTitle>영양분 섭취량</SubTitle>
        <styled.ContentsBox>
          <div>fghfgh</div>
          <div>fghfgh</div>
          <div>fghfgh</div>
          <div>fghfgh</div>
          <div style={}></>
          <div>총 칼로리 {칼로리} kcal</div>
        </styled.ContentsBox>
      </div>
    </styled.Container>
  );
};

export default DietCalendar;
