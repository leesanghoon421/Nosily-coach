import { useState } from "react";
import BottomNavigation from "@mui/material/BottomNavigation";
import BottomNavigationAction from "@mui/material/BottomNavigationAction";

import RestaurantIcon from "@mui/icons-material/Restaurant";
import HomeIcon from "@mui/icons-material/Home";
import FitnessCenterIcon from "@mui/icons-material/FitnessCenter";

import * as styled from "./style.js";

const BottomNav = () => {
  const [value, setValue] = useState(0);
  return (
    <BottomNavigation
      sx={{
        // 하단 중앙 정렬
        position: "fixed",
        bottom: "18px",
        left: "50%",
        transform: "translateX(-50%)",

        // 모양
        width: "70vw",
        borderRadius: "20px",
        bgcolor: "#EDF2F4",

        "& .Mui-selected": {
          "& .MuiSvgIcon-root, & .MuiBottomNavigationAction-label": {
            color: "#1E90FF",
          },
        },
      }}
      value={value}
      onChange={(e, newValue) => {
        setValue(newValue);
      }}
      showLabels
    >
      <BottomNavigationAction label="식단" icon={<RestaurantIcon />} />
      <BottomNavigationAction label="홈" icon={<HomeIcon />} />
      <BottomNavigationAction label="운동" icon={<FitnessCenterIcon />} />
    </BottomNavigation>
  );
};

export default BottomNav;
