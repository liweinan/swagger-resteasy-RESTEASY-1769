#!/bin/sh
curl 'http://localhost:8080/api/pias' \
-H 'Content-Type: multipart/form-data; boundary=----WebKitFormBoundaryfDLIArfCQoCAKctL' \
--data-binary $'------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[name]"\r\n\r\njgh vhbv\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL--'