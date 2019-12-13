window.onload = function () {

    var accountInfoList = [];
    count = 0;
    var module = (function () {

        function createAccount() {
            var ammount = document.getElementById("ammount");
            var accname = document.getElementById("accname");
            var mylist = document.getElementById("list");

            let name = accname.value;
            let balance = ammount.value;
            var accountObject = {
                name: name,
                balance: balance
            };
            accountInfoList[count] = accountObject;
            mylist.value = mylist.value + "Account Name : " + name +
                "  Balance :" + balance + " \n";
            count++;

        }
        return {
            crAccount: createAccount
        }
    })();
    var createAcc = document.getElementById("create");

    createAcc.onclick = module.crAccount;

}


