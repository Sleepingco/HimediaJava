    let oEditors = []

    smartEditor = function() {
        console.log("Naver SmartEditor")
        nhn.husky.EZCreator.createInIFrame({
            oAppRef: oEditors,
            elPlaceHolder: "editorTxt",
            sSkinURI: "/smarteditor/SmartEditor2Skin.html",
            fCreator: "createSEditor2"
        })
    }

    $(document).ready(function() {
        smartEditor()
        $("#submitButton").click(function() {
            submitPost();
        });
    });
    
    submitPost = function() {
        oEditors.getById["editorTxt"].exec("UPDATE_CONTENTS_FIELD", [])
        let content = document.getElementById("editorTxt").value

        if(content == '') {
            alert("내용을 입력해주세요.")
            oEditors.getById["editorTxt"].exec("FOCUS")
            return
        } else {
            let post = {
            	seq: $("#seq").val(),
                title: $("#community_title").val(),
                content: content
            }

            $.ajax({
                type: "POST",
                url: "/updatepost",
                data: post,
                success: function(data) {
                    console.log('success')
                    alert('저장하였습니다.')
                    document.location = data
                },
                error: function(jqXHR, textStatus, errorThrown) {
                    console.log(jqXHR)
                    alert('오류가 발생하였습니다.')
                }
            })
        }
    }