<!doctype html>
<html lang = "en">
<head>
    <meta charset = "UTF-8">
    <meta name = "viewport"
          content = "width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv = "X-UA-Compatible" content = "ie=edge">
    <title>EmojiPhrases</title>
    <link href = "//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel = "stylesheet">
    <script src = "//ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src = "//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
    <p class = "h1">Participants: </p>
    <ul class = "list-group list-group-flush ui-icon">
        <#list users as user>
            <li class = "list-group-item">
                <div class = "form-check">
                    <input class = "form-check-input" type = "radio" name = "flexRadioDefault" id = "${user.name}">
                    <label class = "form-check-label" for = "${user.name}">
                        ${user.name}
                    </label>
                </div>
            </li>
        </#list>
    </ul>
    <br>

    <p class = "h1">Communities: </p><br>
    <div class = "align-items-center">
        <li style = "display: inline-block; width: 100%; text-align: center;">
            <#list communities as community>
                <a href = "${community.link}">
                    <img src = "${community.imageUrl}" class = "figure-img img-fluid rounded"
                         style = "width:200px; height:200px"/>
                </a>
            </#list>
        </li>
    </div>
</body>
</html>
