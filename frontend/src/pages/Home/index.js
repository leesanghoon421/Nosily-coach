import { useState } from "react";
import { makeStyles } from "tss-react/mui";
import BottomNavigation from "@mui/material/BottomNavigation";
import BottomNavigationAction from "@mui/material/BottomNavigationAction";

import RestaurantIcon from "@mui/icons-material/Restaurant";
import LibraryBooksIcon from "@mui/icons-material/LibraryBooks";
import HomeIcon from "@mui/icons-material/Home";
import FitnessCenterIcon from "@mui/icons-material/FitnessCenter";
import PersonIcon from "@mui/icons-material/Person";

import * as styled from "./style.js";

import { Timeit } from "react-timeit";

const useStyles = makeStyles({
  root: {
    width: "100%",
    position: "fixed",
    bottom: 0,
  },
});

const Home = () => {
  const classes = useStyles();
  const [value, setValue] = useState(0);

  const [time, setTime] = useState();
  return (
    <>
      <styled.timeContainer>
        <Timeit onChange={(time) => setTime(time)} defualtValue="10:10" />
      </styled.timeContainer>
      <styled.BottomNavigationContainer>
        <BottomNavigation
          sx={{
            "& .Mui-selected": {
              "& .MuiSvgIcon-root, & .MuiBottomNavigationAction-label": {
                color: "#d80032",
              },
            },
          }}
          value={value}
          onChange={(e, newValue) => {
            setValue(newValue);
          }}
          showLabels
          className={classes.root}
        >
          <BottomNavigationAction
            className={classes.root}
            label="식단 관리"
            icon={<RestaurantIcon />}
          />
          <BottomNavigationAction
            label="라이브러리"
            icon={<LibraryBooksIcon />}
          />
          <BottomNavigationAction label="홈" icon={<HomeIcon />} />
          <BottomNavigationAction label="운동" icon={<FitnessCenterIcon />} />
          <BottomNavigationAction label="마이 페이지" icon={<PersonIcon />} />
        </BottomNavigation>
      </styled.BottomNavigationContainer>
    </>
  );
};

export default Home;
