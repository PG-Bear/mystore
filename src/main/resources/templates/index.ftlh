<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>商店</title>
    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>

    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
    <script src="https://cdn.staticfile.org/vue/2.2.2/vue.min.js"></script>

</head>
<body>
<div id="app" class="container-fluid">
    <div class="col-sm-6 col-sm-offset-3" style="margin-top: 70px">
        <h1 class="text-center">商店demo</h1>
        <div class="row">
            <a href="/goods/all">全部商品</a><hr>
        </div>
        <h2 class="text-center">查询</h2>
        <form action="/goods/search">
            <div class="form-group">
                <label>name</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="name" >
            </div>
            <button type="submit" style="margin-top: 10px" class="btn btn-primary btn-block">submit</button>
        </form>
        <hr>
        <h2 class="text-center">添加</h2>
        <form action="/goods/add" method="post">
            <div class="form-group">
                <label for="name">name</label>
                <!--           注意bootstrap默认input 没有name属性，需要手动添加-->
                <input type="text" class="form-control" id="name" name="name" placeholder="name"  >
            </div>
            <div class="form-group">
                <label for="type">type</label>
                <select id="type" name="type">
                    <option>笔记本电脑</option>
                    <option>酒</option>
                    <option>手机</option>
                    <option>手表</option>
                </select>
            </div>
            <div class="form-group">
                <label for="price">price</label>
                <input type="number" min="0" class="form-control" id="price" name="price" placeholder="price" >
            </div>
            <div class="form-group">
                <label for="description">description</label>
                <input type="text" class="form-control" id="description" name="description" placeholder="description" >
            </div>
            <button type="submit" style="margin-top: 10px" class="btn btn-primary btn-block">submit</button>
        </form>

        <hr>

        <h2 class="text-center">删除</h2>
        <form action="/goods/delete" method="get">
            <div class="form-group">
                <label>id</label>
                <input type="number" min="1" class="form-control" id="id" name="id" placeholder="id" >
            </div>
            <button type="submit" style="margin-top: 10px" class="btn btn-primary btn-block">submit</button>
        </form>

        <hr>

        <h2 class="text-center">修改</h2>
        <form action="/goods/update" method="post" >
            <div class="form-group">
                <label>id</label>
                <input type="number" min="1" class="form-control" id="id" name="id" placeholder="id" >
            </div>
            <div class="form-group">
                <label>name</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="name" >
            </div>
            <div class="form-group">
                <label for="type">type</label>
                <select id="type" name="type">
                    <option>笔记本电脑</option>
                    <option>酒</option>
                    <option>手机</option>
                    <option>手表</option>
                </select>
            </div>
            <div class="form-group">
                <label for="price">price</label>
                <input type="number" min="0" class="form-control" id="price" name="price" placeholder="price" >
            </div>
            <div class="form-group">
                <label for="description">description</label>
                <input type="text" class="form-control" id="description" name="description" placeholder="description" >
            </div>
            <button type="submit" style="margin-top: 10px" class="btn btn-primary btn-block">submit</button>
        </form>
        <hr>

    </div>

</div>

</body>
</html>