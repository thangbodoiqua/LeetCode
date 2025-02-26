// Nhận dữ liệu về thời tiết từ một API, trả về dữ liệu về thời tiết ở thời điểm hiện tại (chính xác theo số giờ)
// Và trả về dữ liệu của một tuần kế tiếp



const API_KEY = "MYQDXHKKGU8MJCRWFFUZEW8LX";
const day = new Date();


const fetchAPI = async (city) => {
    const url = `https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/${city}?unitGroup=metric&key=${API_KEY}&contentType=json&iconSet=icons2`;
    const data = await fetch(url)
        .then(function(response) {
            if (!response.ok) {
              throw Error(response.statusText);
            }
            return response.json();
          })
          .then(function(response) {
            return response;
          })
          .catch(function(error) {
            console.log('Looks like there was a problem: \n', error);
          });
          
    const currentWeather = data.days[0].hours[day.getHours()];
    const next24HoursData = next24Hours(data);
    const nextWeekData = nextWeek(data);


}

const next24Hours = (data) => {
    let next24HoursData = [];
    let nextHour = day.getHours() + 1;
    for (let i = 0; i < 24; i++) {
        if (nextHour > 23) {
            next24HoursData.push(data.days[1].hours[nextHour%24]);
            nextHour++;
        }else{
            next24HoursData.push(data.days[0].hours[nextHour]);
            nextHour++;
        }
    }
    return next24HoursData;
}

const nextWeek = (data) => {
    let nextWeekData = [];
    for (let i = 1; i < 8; i++) {
        nextWeekData.push(data.days[i]);
    }
    return nextWeekData;
}
fetchAPI("Hanoi");