import {get} from "./utilities/fetchApi.m.js";

async function  test() {
    let result = await get('/start').then(response => {
        return response.text() || '{}';
    });

    let data = JSON.parse(result);
    console.log(result);

}

test();