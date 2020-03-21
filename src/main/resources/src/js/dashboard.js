export function dashboard(e) {
    $("#loginForm").on("submit", async function (e) {
        let username = $("#email").val();
        let password = $("#password").val();
        let credentials = { username: username, password: password };
        console.log(credentials);
        e.preventDefault();
        e.stopPropagation();
        const url = "/api/authenticate"
        const response = await fetch(url, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(credentials)
        });
        const token = await response.json()
        localStorage.setItem('token', token.jwt);
    });
} 