let cssStringToExportData = `
<style type="text/css" media="print">
@media print
{
   @page {
     margin-top: 2rem;
     margin-bottom: 2rem;
     size: landscape;
   }
   body  {
     padding-top: 72px;
     padding-bottom: 72px ;
   }
   
}</style>


<style>

table {
  border-collapse: collapse;
}
th, td {
  border: 1px solid black;
  padding: 8px;
}

.d-flx {
  display: flex;
}
.flx-jus-cen {
  display: flex;
  justify-content: center;
}

.flx-jus-spc-bet {
  display: flex;
  justify-content: space-between;
}
.txt-alin-cntr {
  text-align: center;
}

.flx-dir-clm-rvs {
  display: flex;
  flex-direction: column-reverse;
}

/* margin-padding */

.m-1 {
  margin: 1rem;
}
.mt-1 {
  margin-top: 1rem;
}
.mr-1 {
  margin-right: 1rem;
}
.mb-1 {
  margin-bottom: 1rem;
}
.ml-1 {
  margin-left: 1rem;
}
.p-1 {
  margin: 1rem;
}
.pt-1 {
  margin-top: 1rem;
}
.pr-1 {
  margin-right: 1rem;
}
.pb-1 {
  margin-bottom: 1rem;
}
.pl-1 {
  margin-left: 1rem;
}

/* border */

.border-none {
  border: none;
}
.border-none-right {
  border-right: none;
}
.border-none-left {
  border-left: none;
}
.border-none-top {
  border-top: none;
}
.border-none-bottom {
  border-bottom: none;
}
.border-right {
  border-right: 1px solid black !important;
}
.border-left {
  border-left: 1px solid black  !important;
}
.border-top {
  border-top: 1px solid black !important;
}
.border-bottom {
  border-bottom: 1px solid black !important;
}

.height-5rem{
  height:5rem;
}


/* cursor */
.cur-p {
  cursor: pointer;
}

.width-100 {
  width: 100%;
}

#tableContainerNew {
  background-color: white;
  font-size: 1rem;
  font-weight: bold;
}
#tableContainerNew span {
  background-color: white;
  font-size: 1rem;
  font-weight: bold;
  border: 2px solid black;
  text-align: center;
  color: black;
  width: 6rem;
  display: inline-block;
}
.pdf-heading .head-wrapper {
  display: flex;
}

.pdf-heading .head-wrapper .ch1 {
  /* border: 1px solid black; */
  width: 14rem;
  height: 5rem;
  border: 1px solid black;
}
.pdf-heading .head-wrapper .ch2 {
  /* border: 1px solid black; */
  width: 50rem;
  height: 5rem;
  border: 1px solid black;
  display: flex;
  justify-content: center;
  align-items: center;
}
.pdf-heading .head-wrapper .ch3 {
  /* border: 1px solid black; */
  width: 14rem;
  height: 5rem;
  border: 1px solid black;
}

.pdf-heading .head-wrapper .heading-main-container {
  font-size: 1.5rem;
  font-weight: bold;
  width: 30rem;
  /* height: 0  rem; */
  padding: 1rem;
}

.name-product-table {
  width: 100%;
}

.batch-details-tables table {
  width: 100%;
}
.batch-details-tables td {
  height: 2.5rem !important;
}
.PARAMETERS-details-tables table {
  width: 100%;
}
.PARAMETERS-details-tables td {
  height: 2.5rem !important;
}

.table-lable-left table tr td:nth-child(1) {
  color: rgb(2, 3, 66);
  text-align: right;
}
.batch-details-tables td, .PARAMETERS-details-tables td {
  border: none;
}







#tableContainer td, #tableContainer th{
  padding: 2px 5px !important ;
}

</style>


`;

const demo = (e) => {
  console.log(e);
};
// jsx satrts
const jsx = (tag, attr, child) => {
  // let attri = "";
  // for (const key in attr) {
  //   attri += attr[key] ? ` ${key}="${attr[key]}" ` : key;
  // }
  // const srtElement = "<" + tag + attri + ">" + child + "<" + tag + "/>";
  // console.log(srtElement, "srtElement single");
  //   document.getElementById(id).innerHTML = srtElement;
  if (!tag) return;
  let newElement = document.createElement(tag);
  // console.log(child, "chiled here ", typeof child);
  if (typeof child == "object") {
    child?.map((e, i) => {
      // console.log(newElement, "newElementnewElement", i);
      if (e?.nodeType === Node.ELEMENT_NODE) {
        newElement.appendChild(e);
      }
    });
  } else {
    newElement.textContent = child;
  }

  for (const key in attr) {
    newElement.setAttribute(key, attr[key]);
  }

  // console.log(newElement, "newElement");
  return newElement;
};

const jsxMultiTag = (data, id, isClearOld) => {
  // isClearOld ? (document.getElementById(id).innerHTML = "") : null;
  let srtElement = "";
  const elements = data.map((e, i) => {
    // console.log(i, e, "iiiiiiieeeeeeee");
    return jsx(...e);
  });

  // console.log(elements, "elements111111111");
  if (!id) {
    return elements;
  }
  elements.map((ele) => {
    document.getElementById(id).appendChild(ele);
  });
  // console.log(elements, "elements");
  return elements;
};

// setTimeout(() => {
//   jsxMultiTag(
//     [
//       ["div", { class: "okok", id: "pll" }, "okok"],
//       ["span", { class: "plsplpsls", id: "osidsssssnkd" }, "ssssssssssssss"],
//     ],
//     "addEle",
//     true
//   );
// document.getElementById("addEle").innerHTML = "";
// let c1 = jsx("span", {}, "im span");
// let c2 = jsx("div", {}, "im div");

// document
//   .getElementById("addEle")
//   .appendChild(jsx("div", { onclick: "demo(event)" }, [c1, c2]));
// }, 2000);

// jsx ends

// veriables
let data = {};
let pdfDataBox = {
  // machineName: "HOT WATER SPRAY STERILIZER AUTOCLAVE-III- BATCH REPORT",
  // productName: "Autoclave-3",
  // batchNo: "Batch test",
  // lotNo: "2",
  // cycleNo: "10",
  // packSizeInMl: "150",
  // timeInterval: "10",
  // programNo: "1",
  // cycleStartDateTime: "2023-06-14 16:33:17",
  // cycleEndDateTime: "2023-06-14 16:33:17",
  // coolingTemperature: 54.5,
  // overheating: 0.0,
  // sterilizationTemperature: 107.0,
  // plusTempLimit: 1.0,
  // minusTempLimit: 0.0,
  // sterilizationTime: 10.0,
  // chamberPressureLimitDuringHeating: 1.0,
  // chamberPressureSterilizationTemp: 1.4,
  // chamberPressureAtStartCooling: 1.5,
  // chamberPressureAtEndOfCooling: 0.03,
  // chamberPressureAfterDrain: 0.0,
  // purifiedWaterLevel: 74.0,
};
let dataKey = [];
let dataRequire = {};

let extra = [];

let isModel = false;
let date = new Date();
// veriables end
const allInputs = document.getElementsByClassName("input-field");
for (const key in allInputs) {
  const e = allInputs[key];
  if (typeof e == "object") {
    data = { ...data, [e.name]: "" };
    dataKey = [...dataKey, e.name];
    extra = [...extra, e.placeholder];
    dataRequire = { ...dataRequire, [e.name]: e.required };
  }
}
let dataCopy = { ...data };
console.log(data, "data");

const onChangeInput = (e, num) => {
  // checkNumber(e.target.value);
  document.getElementById("tableContainerNew").style.display = "none";

  let id = e.target.id;
  if (num) {
    if (!isNaN(Number(e.target.value))) {
      data = { ...data, [e.target.name]: e.target.value };
    } else {
      document.getElementById(id).value = data[e.target.name];
      // alert("only number are allowed");
      modelOnDemo(
        `Only Number are allowed`,
        [
          {
            name: "Close",
            onclick: "closeModel()",
            class: "b-100",
          },
          // {
          //   name: "Ok",
          //   onclick: "closeModel()",
          //   class: "noclass",
          // },
        ],
        2000
      );
    }
  } else if (e.target.type == "date") {
    if (data.dateTimeMin || data.dateTimeMax) {
      data = { ...data, [e.target.name]: e.target.value };

      console.log(
        data.dateTimeMin > data.dateTimeMax,
        "datechack",
        data.dateTimeMin,
        data.dateTimeMax
      );
      if (data.dateTimeMin > data.dateTimeMax) {
        document.getElementById(e.target.id).value = "";
        alert("wrong data");
      }
    } else {
      data = { ...data, [e.target.name]: e.target.value };
    }
  } else {
    data = { ...data, [e.target.name]: e.target.value };
  }

  console.log(e.target.name, data, dataKey, extra, "change", dataRequire);
};

const fetchData = (btn) => {
  document.getElementById("nodataText").style.display = "none";

  const fetechBody = {
    ...data,
    dateTimeMax: `${data.dateTimeMax} ${data.toTime}`,
    dateTimeMin: `${data.dateTimeMin} ${data.fromTime}`,
  };
  delete fetechBody.fromTime;
  delete fetechBody.toTime;

  openBackground();
  let dataTab = [];
  // let Tab = [
  //   {
  //     "DATE & TIME": "03/08/2021 10:22:17",
  //     "STEP NAME": "FILLING",
  //     RFT1: "0.0",
  //     "RFT1-F0": "35.00",
  //     RFT2: "dates",
  //     "RFT2-F0": "35.00",
  //     RFT3: "0.0",
  //     "RFT3-F0": "35.00",
  //     RFT4: "0.0",
  //     "RFT4-F0": "35.00",
  //     TC1: "35.0",
  //     TS1: "36.0",
  //     PRESSURE: "0.20",
  //     "WATER LEVEL": "10",
  //   },
  //   {
  //     "DATE & TIME": "03/08/2021 10:22:17",
  //     "STEP NAME": "FILLING",
  //     RFT1: "0.0",
  //     "RFT1-F0": "35.00",
  //     RFT2: "dates",
  //     "RFT2-F0": "35.00",
  //     RFT3: "0.0",
  //     "RFT3-F0": "35.00",
  //     RFT4: "0.0",
  //     "RFT4-F0": "35.00",
  //     TC1: "35.0",
  //     TS1: "36.0",
  //     PRESSURE: "0.20",
  //     "WATER LEVEL": "10",
  //   },
  //   {
  //     "DATE & TIME": "03/08/2021 10:22:17",
  //     "STEP NAME": "FILLING",
  //     RFT1: "0.0",
  //     "RFT1-F0": "35.00",
  //     RFT2: "dates",
  //     "RFT2-F0": "35.00",
  //     RFT3: "0.0",
  //     "RFT3-F0": "35.00",
  //     RFT4: "0.0",
  //     "RFT4-F0": "35.00",
  //     TC1: "35.0",
  //     TS1: "36.0",
  //     PRESSURE: "0.20",
  //     "WATER LEVEL": "10",
  //   },
  //   {
  //     "DATE & TIME": "03/08/2021 10:22:17",
  //     "STEP NAME": "FILLING",
  //     RFT1: "0.0",
  //     "RFT1-F0": "35.00",
  //     RFT2: "dates",
  //     "RFT2-F0": "35.00",
  //     RFT3: "0.0",
  //     "RFT3-F0": "35.00",
  //     RFT4: "0.0",
  //     "RFT4-F0": "35.00",
  //     TC1: "35.0",
  //     TS1: "36.0",
  //     PRESSURE: "0.20",
  //     "WATER LEVEL": "10",
  //   },
  //   {
  //     "DATE & TIME": "03/08/2021 10:22:17",
  //     "STEP NAME": "FILLING",
  //     RFT1: "0.0",
  //     "RFT1-F0": "35.00",
  //     RFT2: "dates",
  //     "RFT2-F0": "35.00",
  //     RFT3: "0.0",
  //     "RFT3-F0": "35.00",
  //     RFT4: "0.0",
  //     "RFT4-F0": "35.00",
  //     TC1: "35.0",
  //     TS1: "36.0",
  //     PRESSURE: "0.20",
  //     "WATER LEVEL": "10",
  //   },
  //   {
  //     "DATE & TIME": "03/08/2021 10:22:17",
  //     "STEP NAME": "FILLING",
  //     RFT1: "0.0",
  //     "RFT1-F0": "35.00",
  //     RFT2: "dates",
  //     "RFT2-F0": "35.00",
  //     RFT3: "0.0",
  //     "RFT3-F0": "35.00",
  //     RFT4: "0.0",
  //     "RFT4-F0": "35.00",
  //     TC1: "35.0",
  //     TS1: "36.0",
  //     PRESSURE: "0.20",
  //     "WATER LEVEL": "10",
  //   },
  //   {
  //     "DATE & TIME": "03/08/2021 10:22:17",
  //     "STEP NAME": "FILLING",
  //     RFT1: "0.0",
  //     "RFT1-F0": "35.00",
  //     RFT2: "dates",
  //     "RFT2-F0": "35.00",
  //     RFT3: "0.0",
  //     "RFT3-F0": "35.00",
  //     RFT4: "0.0",
  //     "RFT4-F0": "35.00",
  //     TC1: "35.0",
  //     TS1: "36.0",
  //     PRESSURE: "0.20",
  //     "WATER LEVEL": "10",
  //   },
  //   {
  //     "DATE & TIME": "03/08/2021 10:22:17",
  //     "STEP NAME": "FILLING",
  //     RFT1: "0.0",
  //     "RFT1-F0": "35.00",
  //     RFT2: "dates",
  //     "RFT2-F0": "35.00",
  //     RFT3: "0.0",
  //     "RFT3-F0": "35.00",
  //     RFT4: "0.0",
  //     "RFT4-F0": "35.00",
  //     TC1: "35.0",
  //     TS1: "36.0",
  //     PRESSURE: "0.20",
  //     "WATER LEVEL": "10",
  //   },
  //   {
  //     "DATE & TIME": "03/08/2021 10:22:17",
  //     "STEP NAME": "FILLING",
  //     RFT1: "0.0",
  //     "RFT1-F0": "35.00",
  //     RFT2: "dates",
  //     "RFT2-F0": "35.00",
  //     RFT3: "0.0",
  //     "RFT3-F0": "35.00",
  //     RFT4: "0.0",
  //     "RFT4-F0": "35.00",
  //     TC1: "35.0",
  //     TS1: "36.0",
  //     PRESSURE: "0.20",
  //     "WATER LEVEL": "10",
  //   },
  //   {
  //     "DATE & TIME": "03/08/2021 10:22:17",
  //     "STEP NAME": "FILLING",
  //     RFT1: "0.0",
  //     "RFT1-F0": "35.00",
  //     RFT2: "dates",
  //     "RFT2-F0": "35.00",
  //     RFT3: "0.0",
  //     "RFT3-F0": "35.00",
  //     RFT4: "0.0",
  //     "RFT4-F0": "35.00",
  //     TC1: "35.0",
  //     TS1: "36.0",
  //     PRESSURE: "0.20",
  //     "WATER LEVEL": "10",
  //   },
  //   {
  //     "DATE & TIME": "03/08/2021 10:22:17",
  //     "STEP NAME": "FILLING",
  //     RFT1: "0.0",
  //     "RFT1-F0": "35.00",
  //     RFT2: "dates",
  //     "RFT2-F0": "35.00",
  //     RFT3: "0.0",
  //     "RFT3-F0": "35.00",
  //     RFT4: "0.0",
  //     "RFT4-F0": "35.00",
  //     TC1: "35.0",
  //     TS1: "36.0",
  //     PRESSURE: "0.20",
  //     "WATER LEVEL": "10",
  //   },
  // ];
  fetch("http://43.205.144.183:8080/autoclave/get", {
    method: "POST",
    body: JSON.stringify(fetechBody),
    headers: { "Content-Type": "application/json" },
  })
    .then((data) => {
      return data.json();
    })
    .then((datas) => {
      console.log(datas, "data", datas.data);
      dataTab = datas.data;
      if (!datas.data.length) {
        document.getElementById("tableContainerNew").style.display = "none";
        document.getElementById("nodataText").style.display = "block";
      }
      pdfDataBox = datas;
      console.log(dataTab, "dataTab 11");
      for (const lable in pdfDataBox) {
        console.log(lable, "lable");
        if (document.getElementById(lable)) {
          document.getElementById(lable).innerHTML = pdfDataBox[lable];
        }
      }
      createTable(dataTab);
      if (btn == "export") {
        takePdf();
      }
      closeModel();
    });

  // setTimeout(() => {

  // }, 200);
};

const exportData = (btn) => {
  let isInputTrue = false;
  for (let i = 0; i < dataKey.length; i++) {
    if (dataRequire[dataKey[i]] && !data[dataKey[i]]) {
      isInputTrue = false;
      console.log("Please Select", dataKey[i]);
      //   alert(`Please Enter ${dataKey[i]}`);
      // addModel(`Please Enter ${dataKey[i]}`);
      modelOnDemo(
        `Please ${extra[i]}`,
        [
          {
            name: "Close",
            onclick: "closeModel()",
            class: "b-100",
          },
          // {
          //   name: "Ok",
          //   onclick: "closeModel()",
          //   class: "noclass",
          // },
        ],
        5000
      );

      break;
    } else {
      isInputTrue = true;
    }
  }

  if (isInputTrue) {
    if (btn == "view") {
      document.getElementById("tableContainerNew").style.display = "block";
    } else if (btn == "export") {
      // document.getElementById("tableContainerNew").style.display = "none";
    }

    fetchData(btn);
  }

  console.log("exportData");
};

const reset = () => {
  isModel = false;
  data = { ...dataCopy };
  dataKey.map((ele, i) => {
    // document.getElementById(i).valueAsDate=date
    document.getElementById(i).value = "";
  });
  document.getElementById("tableContainer").innerHTML = "";
  document.getElementById("tableContainerNew").style.display = "none";
  document.getElementById("nodataText").style.display = "none";

};

// model-----------------------------------------------------------------

const openBackground = () => {
  const loading = jsx("div", {}, null);
  document.getElementById("fullWidthBackground").appendChild(
    jsx(
      "div",
      //
      {
        class: "lds-ripple",
        // style: "display:block",
      },
      [loading]
    )
  );
};

const closeModel = () => {
  document.getElementById("fullWidthBackground").innerHTML = "";
  document.getElementById("model").innerHTML = "";
};

const modelOnDemo = (msg, btn, autoClose) => {
  document.getElementById("fullWidthBackground").appendChild(
    jsx(
      "div",
      {
        class: "popUpFundo red",
        style: "display:block",
      },
      null
    )
  );

  const btnss = btn?.map((e) => {
    return [
      "button",
      {
        class: `puCancelar ${e.class} `,
        onclick: e.onclick,
      },
      e.name,
    ];
  });

  const myTextMsg = jsx("span", {}, msg);
  const allChildes = jsxMultiTag(
    [
      ["div", { class: "error-icon" }, "O"],
      ["div", {}, [myTextMsg]],
      [],
      // [
      //   "button",
      //   { class: "puCancelar b-100", onclick: "closeModel()" },
      //   "Close",
      // ],
      ...btnss,
    ],
    null,
    true
  );
  document
    .getElementById("model")
    .appendChild(
      jsx("div", { class: "popUp p red   popUpEntrada" }, allChildes)
    );

  setTimeout(closeModel, autoClose ? autoClose : 10000);
};

// const removeModel = () => {
//   if (isModel) {
//     document.getElementById("model").classList?.remove("model");
//     document.getElementById("model").innerHTML = "";
//     console.log("model removed");
//   }
//   isModel = false;
// };
// document.body.addEventListener("click", removeModel);

// const addModel = (msg) => {
//   document.getElementById("model").classList.add("model");
//   document.getElementById("model").innerHTML =
//     "<div class='model-errmsg' >" + msg + "</div>";
//   setTimeout(() => {
//     isModel = true;
//   }, 500);
// };

//model ends-------------------------------------------------------
//slider on off
const wrapper = document.getElementById("wrapper");
const sliderOpen = () => {
  if (wrapper.classList.length == 2) {
    wrapper.classList.remove("collapse");
  }
};
const sliderClose = () => {
  wrapper.classList.add("collapse");
};
//-------input rejex for number only----------------------------------------------------
const checkNumber = (e) => {
  const numRej = /^[0-9\b.]+$/;
  console.log(e, numRej, "numRej");
};
//trying pdf
const downloadFile = () => {
  takePdf();
};
const takePdf = () => {
  var element = document.getElementById("tableContainerNew");

  // Get the inner HTML of the element
  var html = element.innerHTML;

  console.log(html);
  console.log(document.getElementById("pdf"), "pdf");
  // var divContents = document.getElementById("pdf");
  var printWindow = window.open("", "", "height=400,width=800");
  printWindow.document.write("<html>  <head><title>Report</title>");
  printWindow.document.write(
    ` ${cssStringToExportData}
    </head><body >`
  );
  printWindow.document.write(html);
  printWindow.document.write("</body></html>");
  setTimeout(() => {
    printWindow.print();
    printWindow.close();
  }, 1000);
};

// const graph=()=>{
//   var canvas = document.getElementById("graphCanvas");
//   var context = canvas.getContext("2d");

//   // Define the data for the graph (sample data)
//   var data = [20, 50, 30, 70, 45, 60];

//   // Define the width and height of the graph
//   var graphWidth = canvas.width - 40;
//   var graphHeight = canvas.height - 40;

//   // Calculate the width of each bar
//   var barWidth = graphWidth / data.length;

//   // Calculate the maximum value in the data array
//   var maxValue = Math.max.apply(null, data);

//   // Draw the bars
//   for (var i = 0; i < data.length; i++) {
//       var barHeight = (data[i] / maxValue) * graphHeight;

//       // Set the fill color
//       context.fillStyle = "#007bff";

//       // Draw the bar
//       context.fillRect(
//           20 + i * barWidth, // x-coordinate
//           canvas.height - barHeight - 20, // y-coordinate
//           barWidth - 10, // width
//           barHeight // height
//       );
//   }

//   // Convert canvas to image

// }
const graph = () => {
  // Get the canvas element
  var canvas = document.getElementById("graphCanvas");
  var context = canvas.getContext("2d");

  // Define the data for the graph (sample data)
  var data = [
    { x: 0, y: 20 },
    { x: 1, y: 50 },
    { x: 2, y: 30 },
    { x: 3, y: 70 },
    { x: 4, y: 45 },
    { x: 5, y: 60 },
  ];

  // Define the width and height of the graph
  var graphWidth = canvas.width - 40;
  var graphHeight = canvas.height - 40;

  // Calculate the maximum value in the data array
  var maxValue = Math.max.apply(
    null,
    data.map(function (point) {
      return point.y;
    })
  );

  // Calculate the x and y scaling factors
  var xScale = graphWidth / (data.length - 1);
  var yScale = graphHeight / maxValue;

  // Draw the axes
  context.beginPath();
  context.moveTo(20, 20);
  context.lineTo(20, canvas.height - 20);
  context.lineTo(canvas.width - 20, canvas.height - 20);
  context.strokeStyle = "#000";
  context.lineWidth = 2;
  context.stroke();

  // Draw the data points and lines
  context.beginPath();
  context.moveTo(20, canvas.height - 20 - data[0].y * yScale);
  for (var i = 1; i < data.length; i++) {
    var point = data[i];
    context.lineTo(
      20 + point.x * xScale,
      canvas.height - 20 - point.y * yScale
    );
  }
  context.strokeStyle = "#007bff";
  context.lineWidth = 2;
  context.stroke();

  // Draw the y-axis labels
  var yLabelsCount = 5;
  var yLabelStep = Math.ceil(maxValue / yLabelsCount);
  for (var i = 0; i <= yLabelsCount; i++) {
    var yLabel = (i * yLabelStep).toString();
    var yPosition = canvas.height - 20 - i * yLabelStep * yScale;
    context.fillStyle = "#000";
    context.fillText(yLabel, 5, yPosition);
  }
  // Draw the x-axis labels
  for (var i = 0; i < data.length; i++) {
    var point = data[i];
    var xLabel = "Label " + point.x.toString(); // Custom x-axis label
    context.fillStyle = "#000";
    context.fillText(xLabel, 20 + point.x * xScale, canvas.height - 5);
  }
};

function convertToImage() {
  var canvas = document.getElementById("graphCanvas");
  var image = document.getElementById("graphImage");
  image.src = canvas.toDataURL("image/png");
  image.style.display = "block";
  takePdf();
}

// table creatipong
const createTable = (data) => {
  console.log(data, "in create table");
  document.getElementById("tableContainer").innerHTML = "";
  // Array of objects
  // var data1 = [
  //   { name: "John", age: 25, city: "New York" },
  //   { name: "Jane", age: 30, city: "London" },
  //   { name: "Bob", age: 35, city: "Paris" },
  //   { name: "Alice", age: 28, city: "Berlin" },
  // ];

  // Create table element
  var table = document.createElement("table");
  table.style.width = "100%";

  // Create table header row
  var thead = document.createElement("thead");
  var headerRow = document.createElement("tr");
  for (var key in data[0]) {
    var headerCell = document.createElement("th");
    headerCell.style.fontSize = "0.8rem";
    headerCell.style.fontWeight = "bold";

    headerCell.textContent = key.toUpperCase();
    console.log(key.toUpperCase());
    if (key.toUpperCase().includes("DATE")) {
      // headerCell.style.width = "11rem";
    }
    if (key.toUpperCase().includes("WATER")) {
      // headerCell.style.width = "5rem";
    }
    headerRow.appendChild(headerCell);
  }
  thead.appendChild(headerRow);
  table.appendChild(thead);

  // Create table body rows
  var tbody = document.createElement("tbody");
  for (var i = 0; i < data.length; i++) {
    var row = document.createElement("tr");
    for (var key in data[i]) {
      var cell = document.createElement("td");
      cell.style.fontSize = "0.8rem";
      cell.style.textAlign = "center";

      // cell.style.display = "flex";
      // cell.style.flexWrap = "nowrap";

      cell.textContent = data[i][key];
      row.appendChild(cell);
    }
    tbody.appendChild(row);
  }
  table.appendChild(tbody);

  // Add the table to the container element
  var tableContainer = document.getElementById("tableContainer");
  tableContainer.appendChild(table);
};

// createBatchDetails
