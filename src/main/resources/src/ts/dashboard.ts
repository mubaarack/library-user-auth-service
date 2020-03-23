export function dashboard() {
    renderPage(window.location.hash);
    document.getElementById("loginForm")
        .addEventListener("submit", async function (e) {
            let inputUsername = document.getElementById("email")! as HTMLInputElement;
            let inputPassword = document.getElementById("password")! as HTMLInputElement;
            let username = inputUsername.value;
            let password = inputPassword.value;
            let credentials = { username: username, password: password };
            debugger
            e.preventDefault();
            e.stopPropagation();
            const url = "/api/authenticate";
            const response = await fetch(url, {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(credentials)
            });
            const token = await response.json();
            sessionStorage.setItem('token', token.jwt);
    });
    document.getElementById("registerAnchor")
        .addEventListener("click",function () {

        });
    function renderPage(hash: string){
        let isAuthenticated = sessionStorage.getItem('token')!=null;
        renderForm(hash, isAuthenticated);
    }
    window.addEventListener("hashchange", function () {
        renderPage(window.location.hash);
    });
    function renderForm(selector: string, isAuthenticated: boolean){
        // if(isAuthenticated && selector=="#login")
        //     document.querySelector(selector).classList.add("hidden");
        // else if(!isAuthenticated && selector=="#login")
        //     document.querySelector(selector).classList.remove("hidden");
        // if(selector=="#register"){
        //     document.querySelector(selector).classList.remove("hidden");
        //     document.querySelector("#login").classList.add("hidden");
        // }
    }
}
