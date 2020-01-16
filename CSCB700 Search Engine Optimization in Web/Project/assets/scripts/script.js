const showPrivacyPolicy = () => {
    $('#privacyPolicyModal').show();
    sessionStorage.setItem("hasLoaded", "Yes")
}

window.addEventListener('load', () => {
    if (!sessionStorage.getItem("hasLoaded")) {
        showPrivacyPolicy();
    }

    $('#declineButton').on('click', () => {
        $('#privacyPolicyModal').hide();
    });

    $('#acceptButton').on('click', () => {
        $('#privacyPolicyModal').hide();
    });

    $('#closeButton').on('click', () => {
        $('#privacyPolicyModal').hide();
    });
});