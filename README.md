# Test Case for RESTEASY-1769

The method to reproduce the problem in Undertow:

1. Start `Runner` class in the project.
2. Run this command:

```bash
$ curl 'http://localhost:8080/api/pias' -H 'Origin: http://localhost:4200' -H 'Accept-Encoding: gzip, deflate, br' -H 'Accept-Language: fr-FR,fr;q=0.9,en-US;q=0.8,en;q=0.7' -H 'User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36' -H 'Content-Type: multipart/form-data; boundary=----WebKitFormBoundaryfDLIArfCQoCAKctL' -H 'Accept: */*' -H 'Referer: http://localhost:4200/' -H 'Connection: keep-alive' -H 'DNT: 1' --data-binary $'------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[name]"\r\n\r\njgh vhbv\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[author_name]"\r\n\r\njhbhb\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[evaluator_name]"\r\n\r\nhjb\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[validator_name]"\r\n\r\nhjbjhb\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[dpo_status]"\r\n\r\nundefined\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[dpo_opinion]"\r\n\r\nundefined\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[concerned_people_opinion]"\r\n\r\nundefined\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[concerned_people_status]"\r\n\r\nundefined\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[rejected_reason]"\r\n\r\nundefined\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[applied_adjustements]"\r\n\r\nundefined\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[created_at]"\r\n\r\nWed Dec 13 2017 11:13:03 GMT+0100 (CET)\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[updated_at]"\r\n\r\nundefined\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[status]"\r\n\r\n0\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[dpos_names]"\r\n\r\nundefined\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[people_names]"\r\n\r\nundefined\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL--\r\n' --compressed
```

The method to reproduce the problem in Tomcat:

1. Run `mvn package` to produce WAR file: `swagger-resteasy-1.0-SNAPSHOT.war`
2. Put the WAR file into Tomcat `webapp` directory
3. Start Tomcat server
4. Run the following command to reproduce the problem:

```bash
$ curl 'http://127.0.0.1:8080/swagger-resteasy-1.0-SNAPSHOT/pias' -H 'Origin: http://localhost:4200' -H 'Accept-Encoding: gzip, deflate, br' -H 'Accept-Language: fr-FR,fr;q=0.9,en-US;q=0.8,en;q=0.7' -H 'User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36' -H 'Content-Type: multipart/form-data; boundary=----WebKitFormBoundaryfDLIArfCQoCAKctL' -H 'Accept: */*' -H 'Referer: http://localhost:4200/' -H 'Connection: keep-alive' -H 'DNT: 1' --data-binary $'------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[name]"\r\n\r\njgh vhbv\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[author_name]"\r\n\r\njhbhb\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[evaluator_name]"\r\n\r\nhjb\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[validator_name]"\r\n\r\nhjbjhb\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[dpo_status]"\r\n\r\nundefined\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[dpo_opinion]"\r\n\r\nundefined\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[concerned_people_opinion]"\r\n\r\nundefined\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[concerned_people_status]"\r\n\r\nundefined\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[rejected_reason]"\r\n\r\nundefined\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[applied_adjustements]"\r\n\r\nundefined\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[created_at]"\r\n\r\nWed Dec 13 2017 11:13:03 GMT+0100 (CET)\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[updated_at]"\r\n\r\nundefined\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[status]"\r\n\r\n0\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[dpos_names]"\r\n\r\nundefined\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[people_names]"\r\n\r\nundefined\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL--\r\n' --compressed
java.io.IOException: Stream closed$
```

Decoded request is like this:

```txt
------WebKitFormBoundaryfDLIArfCQoCAKctL
Content-Disposition: form-data; name="pia[name]"

jgh vhbv
------WebKitFormBoundaryfDLIArfCQoCAKctL
Content-Disposition: form-data; name="pia[author_name]"

jhbhb
------WebKitFormBoundaryfDLIArfCQoCAKctL
Content-Disposition: form-data; name="pia[evaluator_name]"

hjb
------WebKitFormBoundaryfDLIArfCQoCAKctL
Content-Disposition: form-data; name="pia[validator_name]"

hjbjhb
------WebKitFormBoundaryfDLIArfCQoCAKctL
Content-Disposition: form-data; name="pia[dpo_status]"

undefined
------WebKitFormBoundaryfDLIArfCQoCAKctL
Content-Disposition: form-data; name="pia[dpo_opinion]"

undefined
------WebKitFormBoundaryfDLIArfCQoCAKctL
Content-Disposition: form-data; name="pia[concerned_people_opinion]"

undefined
------WebKitFormBoundaryfDLIArfCQoCAKctL
Content-Disposition: form-data; name="pia[concerned_people_status]"

undefined
------WebKitFormBoundaryfDLIArfCQoCAKctL
Content-Disposition: form-data; name="pia[rejected_reason]"

undefined
------WebKitFormBoundaryfDLIArfCQoCAKctL
Content-Disposition: form-data; name="pia[applied_adjustements]"

undefined
------WebKitFormBoundaryfDLIArfCQoCAKctL
Content-Disposition: form-data; name="pia[created_at]"

Wed Dec 13 2017 11:13:03 GMT+0100 (CET)
------WebKitFormBoundaryfDLIArfCQoCAKctL
Content-Disposition: form-data; name="pia[updated_at]"

undefined
------WebKitFormBoundaryfDLIArfCQoCAKctL
Content-Disposition: form-data; name="pia[status]"

0
------WebKitFormBoundaryfDLIArfCQoCAKctL
Content-Disposition: form-data; name="pia[dpos_names]"

undefined
------WebKitFormBoundaryfDLIArfCQoCAKctL
Content-Disposition: form-data; name="pia[people_names]"

undefined
------WebKitFormBoundaryfDLIArfCQoCAKctL--
```

But we don't have to use above complex data to generate the problem. Here's the simplified request:

```bash
$ curl 'http://localhost:8080/api/pias' \
-H 'Content-Type: multipart/form-data; boundary=----WebKitFormBoundaryfDLIArfCQoCAKctL' \
--data-binary $'------WebKitFormBoundaryfDLIArfCQoCAKctL\r\nContent-Disposition: form-data; name="pia[name]"\r\n\r\njgh vhbv\r\n------WebKitFormBoundaryfDLIArfCQoCAKctL\r\n'
```

It can also reproduce the problem:

```bash
java.io.IOException: UT010029: Stream is closed
$
```

work in progress...

