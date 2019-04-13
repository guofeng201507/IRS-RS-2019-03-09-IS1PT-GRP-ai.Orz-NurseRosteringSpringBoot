import {get} from "./utilities/fetchApi.m.js";

async function testSolver() {
    let result = await get('/start').then(response => {
        return response.text() || '{}';
    });

    let data = JSON.parse(result);
    renderResult(data);
}

function renderResult(data) {
    let htmlCode = `<body>This is the result<div>
            <table border='1'>`;

    htmlCode = htmlCode + `<tr>
                            <td>ShiftType</td>
                            <td>Contract</td>
                            <td>Shift</td>
                            <td>Shift Date</td>
                            <td>Employee</td>
                            <!--<td>Shift Date Day of Week</td>-->
                            </tr>`;

    for (let i = 0; i < data.length; i++) {
        let shiftResult = data[i];
        htmlCode = htmlCode + `<tr>`;

        htmlCode = htmlCode + `<td>` + shiftResult['shiftType']['label'] + `</td>`;
        htmlCode = htmlCode + `<td>` + shiftResult['contract']['description'] + `</td>`;
        htmlCode = htmlCode + `<td>` + shiftResult['shift']['label'] + `</td>`;
        htmlCode = htmlCode + `<td>` + shiftResult['shiftDate']['label'] + `</td>`;
        htmlCode = htmlCode + `<td>` + shiftResult['employee']['label'] + `</td>`;

        htmlCode = htmlCode + `</tr>`
    }

    htmlCode = htmlCode + `</table></div></body>`;

    document.body.innerHTML = htmlCode;
}

async function testUI() {
    let result = await get('/sampleResultForCSS.JSON').then(response => {
        return response.text() || '{}';
    });

    let data = JSON.parse(result);
    renderResult(data);
}

// testUI();
testSolver();


