import { useState, useQuery, useEffect } from "react";
import Calendar from "react-calendar";
import moment from "moment/moment.js";
import "react-calendar/dist/Calendar.css"; // css import
import * as styled from "./style.js";

const DietCalendar = () => {
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

  return (
    <div>
      <div>
        <styled.Pointblock>
          <h2>식단 관리</h2>
        </styled.Pointblock>
        
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
        <styled.Title>{value.getDate()}일에 먹은 식단</styled.Title>

        <styled.TopContainer>
          <h3>오늘 먹은 음식</h3>
          <p>아침: {음식목록들[0]} </p>
          <p>점심: {음식목록들[1]} </p>
          <p>저녁: {음식목록들[2]} </p>
        </styled.TopContainer>
        
       
        <styled.Container>
          <div>fghfgh</div>
          <div>fghfgh</div>
          <div>fghfgh</div>
          <div>fghfgh</div>
          <styled.CalBox>총 칼로리 {칼로리} kcal</styled.CalBox>
        </styled.Container>
      </div>
    </div>
  );
};

export default DietCalendar;
