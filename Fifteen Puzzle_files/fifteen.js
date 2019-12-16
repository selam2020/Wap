$('document').ready(
    function () {
        var matrix = [];
        let counter = 0;
        let row = 0;
        $("#puzzlearea div").each(function (ind, el) {
            $(this).addClass('puzzlepiece');
            var ind = Number.parseInt(ind)

            if (ind < 4) {
                row=0;
                matrix.push([row,Number.parseInt(ind)]);
            }
            else if (ind < 8) {
                row = 1;
                matrix.push([row,Number.parseInt(ind) % 4 ]);
            }
            else if (ind < 12) {
                row = 2
                matrix.push([row,Number.parseInt(ind) % 4 ]);
            }
            else if (ind < 16) {
                row = 3
                matrix.push([row,Number.parseInt(ind) % 4 ]);
            }

            place(Number.parseInt(ind)%4, row, this);

        })

        function place(index, row, ele) {
            console.log("row  " + row + "  col  :" +  index);
            var val = mult(row, index);
            
            $(ele).css({
                top: val[0][1] + "px",
                left: val[0][0] + "px",
                
                'background-position': val[0][0]+'px' + " " + val[0][1] + "px"
                
            })
            
            function mult(row, index) {
               let x=0;
               let y=0;
              
                for (let i = 0; i <index; i++) {
                    y += 90;
                    }

                for (let i = 0; i < row; i++) {
                    x += 90;
                }
                console.log(" x :  "+x);
                console.log(" y :  "+y);
                let xy = [[y, x]]
                return xy;
            }
        }

    }

)