//log all pairs of an array
const boxes = [1,2,3,4,5]

function NormalLogAllPairsOfArray(array){
  for(let i=0; i<array.length; i++){
    for(let x=0; x<array.length; x++){
      console.log(array[i],array[x]);
    }
  }
}

NormalLogAllPairsOfArray(boxes);
