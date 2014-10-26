<!DOCTYPE html>
<html>
<head>
    <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
    <script type="text/javascript">
        $(function() {
            $("#send-request").on('click', function () {
                $.ajax({
                    url: '/getJSON',
                    type: 'GET',
                    cache: false,
                    dataType: 'json',
                    success: function(data) {
                        console.log(data);
                    },
                    error: function(data) {
                        alert('err')
                    }
                });
            });
        });
    </script>
</head>
<body>
${message}
<button id="send-request">Send request</button>
</body>
</html>
