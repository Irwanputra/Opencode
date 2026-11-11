.class public Lxyz/easypro/ecrypt/utils/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lxyz/easypro/ecrypt/utils/a;->a:Landroid/content/Context;

    .line 3
    iput-object v0, p0, Lxyz/easypro/ecrypt/utils/a;->b:Ljava/lang/Class;

    .line 4
    iput-object v0, p0, Lxyz/easypro/ecrypt/utils/a;->c:Ljava/lang/ref/WeakReference;

    .line 5
    iput-object p1, p0, Lxyz/easypro/ecrypt/utils/a;->a:Landroid/content/Context;

    :try_start_0
    const-string v1, "\u0019<;\n=6\u001c|>\u0008\"q91+\u0011$6\u000c+\u000b\u0010 :\u00196"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "\u001b\'-\n71\u000c\u0013<\u000c;)\u0011&&,:-\u001d3;"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Class;

    .line 7
    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Object;

    .line 8
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "\u0015\u0002>\u001b9>\u001f7,"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 9
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    const/4 v2, 0x1

    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/ref/WeakReference;

    iput-object p1, p0, Lxyz/easypro/ecrypt/utils/a;->c:Ljava/lang/ref/WeakReference;

    const-string p1, "\u0019<;\n=6\u001c|>\u0008\"q4=>\u001c7;9\"4"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 13
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, Lxyz/easypro/ecrypt/utils/a;->b:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 14
    :catch_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "4=>\u001cr;\u001d*\u007f\u001d<<\n+/\u000c;0\u0016r:\n 0\n"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 46

    move-object/from16 v0, p0

    const/16 v1, 0x109

    const/4 v2, 0x0

    :try_start_0
    new-array v1, v1, [C

    const/16 v3, 0x79

    aput-char v3, v1, v2

    const/4 v4, 0x1

    const/16 v5, 0x7d

    aput-char v5, v1, v4

    const/16 v6, 0xc1

    const/4 v7, 0x2

    aput-char v6, v1, v7

    const/4 v6, 0x3

    const/16 v8, 0xba

    aput-char v8, v1, v6

    const/4 v6, 0x4

    const/16 v9, 0x85

    aput-char v9, v1, v6

    const/16 v6, 0xb8

    const/4 v10, 0x5

    aput-char v6, v1, v10

    const/4 v6, 0x6

    const/16 v11, 0x75

    aput-char v11, v1, v6

    const/4 v6, 0x7

    const/16 v12, 0xa9

    aput-char v12, v1, v6

    const/16 v6, 0x1c

    const/16 v13, 0x8

    aput-char v6, v1, v13

    const/16 v6, 0x9

    const/16 v14, 0xab

    aput-char v14, v1, v6

    const/16 v6, 0xa

    const/16 v15, 0x25

    aput-char v15, v1, v6

    const/16 v6, 0x2e

    const/16 v16, 0xb

    aput-char v6, v1, v16

    const/16 v6, 0xc

    const/16 v17, 0x64

    aput-char v17, v1, v6

    const/16 v6, 0xd

    const v17, 0xffe9

    aput-char v17, v1, v6

    const/16 v6, 0xe

    const/16 v17, 0xa8

    aput-char v17, v1, v6

    const/16 v6, 0xf

    const v17, 0xffe9

    aput-char v17, v1, v6

    const/16 v6, 0x10

    const/16 v17, 0x63

    aput-char v17, v1, v6

    const/16 v6, 0x11

    const/16 v17, 0x76

    aput-char v17, v1, v6

    const/16 v6, 0x12

    const/16 v17, 0xdb

    aput-char v17, v1, v6

    const/16 v6, 0x35

    const/16 v18, 0x13

    aput-char v6, v1, v18

    const/16 v19, 0x14

    aput-char v8, v1, v19

    const/16 v19, 0x15

    aput-char v16, v1, v19

    const/16 v19, 0x16

    const/16 v20, 0x1a

    aput-char v20, v1, v19

    const/16 v19, 0x17

    aput-char v2, v1, v19

    const/16 v19, 0x18

    const/16 v21, 0x9a

    aput-char v21, v1, v19

    const/16 v19, 0x19

    aput-char v8, v1, v19

    const/16 v19, 0x33

    aput-char v19, v1, v20

    const/16 v21, 0x1b

    const/16 v22, 0xd1

    aput-char v22, v1, v21

    const/16 v21, 0x1c

    const/16 v23, 0x22

    aput-char v23, v1, v21

    const/16 v21, 0x1d

    const/16 v23, 0xd4

    aput-char v23, v1, v21

    const/16 v21, 0x1e

    const/16 v23, 0x20

    aput-char v23, v1, v21

    const/16 v21, 0x1f

    const/16 v24, 0x8f

    aput-char v24, v1, v21

    const/16 v21, 0x7c

    aput-char v21, v1, v23

    const/16 v25, 0x21

    const/16 v26, 0x8d

    aput-char v26, v1, v25

    const/16 v25, 0x22

    const/16 v27, 0xcb

    aput-char v27, v1, v25

    const/16 v25, 0x23

    const/16 v28, 0x7a

    aput-char v28, v1, v25

    const/16 v25, 0x24

    const/16 v29, 0x9d

    aput-char v29, v1, v25

    aput-char v6, v1, v15

    const/16 v25, 0x26

    const/16 v30, 0xe6

    aput-char v30, v1, v25

    const/16 v25, 0x27

    const/16 v30, 0x83

    aput-char v30, v1, v25

    const/16 v25, 0x28

    const/16 v31, 0xac

    aput-char v31, v1, v25

    const/16 v25, 0x29

    const v32, 0xffe6

    aput-char v32, v1, v25

    const/16 v25, 0x2a

    const/16 v32, 0x1b

    aput-char v32, v1, v25

    const/16 v25, 0x2b

    aput-char v7, v1, v25

    const/16 v25, 0x7b

    const/16 v32, 0x2c

    aput-char v25, v1, v32

    const/16 v33, 0x2d

    const/16 v34, 0x71

    aput-char v34, v1, v33

    const/16 v33, 0x2e

    const v34, 0xffd5

    aput-char v34, v1, v33

    const/16 v33, 0x2f

    const/16 v34, 0xa2

    aput-char v34, v1, v33

    const/16 v33, 0x30

    const/16 v35, 0x4b

    aput-char v35, v1, v33

    const/16 v33, 0x31

    const/16 v36, 0x6

    aput-char v36, v1, v33

    const/16 v33, 0x54

    const/16 v36, 0x32

    aput-char v33, v1, v36

    const v37, 0xffee

    aput-char v37, v1, v19

    const/16 v37, 0x34

    aput-char v9, v1, v37

    aput-char v22, v1, v6

    const/16 v37, 0x36

    aput-char v17, v1, v37

    const/16 v37, 0x37

    const/16 v38, 0xb4

    aput-char v38, v1, v37

    const/16 v37, 0x38

    aput-char v5, v1, v37

    const/16 v37, 0x39

    aput-char v26, v1, v37

    const/16 v39, 0x3a

    const/16 v40, 0xcd

    aput-char v40, v1, v39

    const/16 v39, 0x3b

    aput-char v24, v1, v39

    const/16 v39, 0x3c

    const/16 v40, 0xb2

    aput-char v40, v1, v39

    const/16 v41, 0x3d

    const v42, 0xffec

    aput-char v42, v1, v41

    const/16 v41, 0xdd

    const/16 v42, 0x3e

    aput-char v41, v1, v42

    const/16 v43, 0x3f

    const/16 v44, 0xa0

    aput-char v44, v1, v43

    const/16 v43, 0x40

    const/16 v44, 0x19

    aput-char v44, v1, v43

    const/16 v43, 0x41

    const v44, 0xfff8

    aput-char v44, v1, v43

    const/16 v43, 0x42

    aput-char v40, v1, v43

    const/16 v43, 0x43

    aput-char v39, v1, v43

    const/16 v43, 0x44

    const/16 v44, 0xde

    aput-char v44, v1, v43

    const/16 v43, 0x45

    const/16 v44, 0xda

    aput-char v44, v1, v43

    const/16 v43, 0x46

    const/16 v45, 0x15

    aput-char v45, v1, v43

    const/16 v43, 0x47

    const/16 v45, 0xe1

    aput-char v45, v1, v43

    const/16 v43, 0x48

    aput-char v35, v1, v43

    const/16 v43, 0x49

    aput-char v21, v1, v43

    const/16 v43, 0x4a

    const v45, 0xfff1

    aput-char v45, v1, v43

    aput-char v5, v1, v35

    const/16 v35, 0x4c

    aput-char v33, v1, v35

    const/16 v35, 0x4d

    const/16 v43, 0x9

    aput-char v43, v1, v35

    const/16 v35, 0x4e

    const v43, 0xffc9

    aput-char v43, v1, v35

    const/16 v35, 0x4f

    const v43, 0xffea

    aput-char v43, v1, v35

    const/16 v35, 0x50

    const/16 v43, 0xb5

    aput-char v43, v1, v35

    const/16 v35, 0x51

    aput-char v37, v1, v35

    const/16 v35, 0x52

    const/16 v43, 0xaf

    aput-char v43, v1, v35

    const/16 v35, 0x53

    aput-char v45, v1, v35

    aput-char v19, v1, v33

    const/16 v19, 0x55

    const/16 v33, 0x80

    aput-char v33, v1, v19

    const/16 v19, 0x56

    aput-char v17, v1, v19

    const/16 v19, 0x57

    const/16 v33, 0xb1

    aput-char v33, v1, v19

    const/16 v19, 0x58

    const/16 v33, 0x7

    aput-char v33, v1, v19

    const/16 v19, 0x59

    const v33, 0xfff6

    aput-char v33, v1, v19

    const/16 v19, 0x5a

    const/16 v33, 0xe5

    aput-char v33, v1, v19

    const/16 v19, 0x5b

    const/16 v33, 0x4c

    aput-char v33, v1, v19

    const/16 v19, 0x5c

    const/16 v33, 0xd6

    aput-char v33, v1, v19

    const/16 v19, 0x5d

    aput-char v45, v1, v19

    const/16 v19, 0x5e

    const/16 v33, 0xc7

    aput-char v33, v1, v19

    const/16 v19, 0x5f

    const/16 v33, 0xbd

    aput-char v33, v1, v19

    const/16 v19, 0x60

    const v33, 0xfff6

    aput-char v33, v1, v19

    const/16 v19, 0x61

    const/16 v33, 0x3f

    aput-char v33, v1, v19

    const/16 v19, 0xcf

    const/16 v33, 0x62

    aput-char v19, v1, v33

    const/16 v19, 0x63

    aput-char v8, v1, v19

    const/16 v19, 0x64

    aput-char v36, v1, v19

    const/16 v19, 0x65

    const/16 v35, 0x57

    aput-char v35, v1, v19

    const/16 v19, 0x66

    const/16 v35, 0x7e

    aput-char v35, v1, v19

    const/16 v19, 0x67

    const/16 v35, 0x36

    aput-char v35, v1, v19

    const/16 v19, 0x68

    aput-char v27, v1, v19

    const/16 v19, 0x69

    const/16 v35, 0xaa

    aput-char v35, v1, v19

    const/16 v19, 0x6a

    const/16 v35, 0xc0

    aput-char v35, v1, v19

    const/16 v19, 0x6b

    const/16 v35, 0x4

    aput-char v35, v1, v19

    const/16 v19, 0x6c

    aput-char v12, v1, v19

    const/16 v19, 0x6d

    const/16 v35, 0x7e

    aput-char v35, v1, v19

    const/16 v19, 0x6e

    const v35, 0xfff4

    aput-char v35, v1, v19

    const/16 v19, 0x6f

    const/16 v35, 0x26

    aput-char v35, v1, v19

    const/16 v19, 0x70

    const/16 v35, 0xd8

    aput-char v35, v1, v19

    const/16 v19, 0x71

    const/16 v35, 0xf0

    aput-char v35, v1, v19

    const/16 v19, 0x72

    const/16 v35, 0x89

    aput-char v35, v1, v19

    const/16 v19, 0x73

    aput-char v11, v1, v19

    const/16 v19, 0x74

    aput-char v15, v1, v19

    const v19, 0xffd3

    aput-char v19, v1, v11

    const/16 v11, 0x76

    const v19, 0xffeb

    aput-char v19, v1, v11

    const/16 v11, 0x77

    aput-char v37, v1, v11

    const/16 v11, 0x78

    const/16 v19, 0x8a

    aput-char v19, v1, v11

    const/16 v11, 0x30

    aput-char v11, v1, v3

    const/16 v11, 0x43

    aput-char v11, v1, v28

    aput-char v39, v1, v25

    const/16 v11, 0xf1

    aput-char v11, v1, v21

    const/16 v11, 0xae

    aput-char v11, v1, v5

    const/16 v5, 0x7e

    aput-char v10, v1, v5

    const/16 v5, 0x7f

    const/16 v11, 0xd8

    aput-char v11, v1, v5

    const/16 v5, 0x80

    const/16 v11, 0x4c

    aput-char v11, v1, v5

    const/16 v5, 0x81

    aput-char v44, v1, v5

    const/16 v5, 0x82

    const/16 v11, 0x17

    aput-char v11, v1, v5

    aput-char v3, v1, v30

    const/16 v5, 0x84

    const/16 v11, 0xc3

    aput-char v11, v1, v5

    const/16 v5, 0x66

    aput-char v5, v1, v9

    const/16 v5, 0x86

    const/16 v9, 0xbb

    aput-char v9, v1, v5

    const/16 v5, 0x87

    const/16 v9, 0x11

    aput-char v9, v1, v5

    const/16 v5, 0x88

    const/16 v9, 0x70

    aput-char v9, v1, v5

    const/16 v5, 0x89

    const/16 v9, 0x6d

    aput-char v9, v1, v5

    const/16 v5, 0x8a

    const v9, 0xffe4

    aput-char v9, v1, v5

    const/16 v5, 0x8b

    const/16 v9, 0xd7

    aput-char v9, v1, v5

    const/16 v5, 0x8c

    const/16 v9, 0x3b

    aput-char v9, v1, v5

    const v5, 0xfff9

    aput-char v5, v1, v26

    const/16 v5, 0x8e

    aput-char v33, v1, v5

    aput-char v27, v1, v24

    const/16 v5, 0x90

    const/16 v9, 0x97

    aput-char v9, v1, v5

    const/16 v5, 0x91

    aput-char v18, v1, v5

    const/16 v5, 0x92

    const/16 v9, 0xbf

    aput-char v9, v1, v5

    const/16 v5, 0x93

    aput-char v38, v1, v5

    const/16 v5, 0x94

    const/16 v9, 0xcf

    aput-char v9, v1, v5

    const/16 v5, 0x95

    const/16 v9, 0xd3

    aput-char v9, v1, v5

    const/16 v5, 0x96

    aput-char v44, v1, v5

    const/16 v5, 0x97

    const/16 v9, 0xb0

    aput-char v9, v1, v5

    const/16 v5, 0x98

    const/16 v9, 0x8c

    aput-char v9, v1, v5

    const/16 v5, 0x99

    const/16 v9, 0xe0

    aput-char v9, v1, v5

    const/16 v5, 0x9a

    const v9, 0xfff9

    aput-char v9, v1, v5

    const/16 v5, 0x9b

    const v9, 0xfffe

    aput-char v9, v1, v5

    const/16 v5, 0x9c

    const v9, 0xfff4

    aput-char v9, v1, v5

    const/16 v5, 0x68

    aput-char v5, v1, v29

    const/16 v5, 0x9e

    const v9, 0xffb0

    aput-char v9, v1, v5

    const/16 v5, 0x9f

    aput-char v42, v1, v5

    const/16 v5, 0xa0

    const/16 v9, 0xf1

    aput-char v9, v1, v5

    const/16 v5, 0xa1

    const/16 v9, 0xef

    aput-char v9, v1, v5

    const/16 v5, 0x52

    aput-char v5, v1, v34

    const/16 v5, 0xa3

    aput-char v33, v1, v5

    const/16 v5, 0xa4

    aput-char v30, v1, v5

    const/16 v5, 0xa5

    aput-char v6, v1, v5

    const/16 v5, 0xa6

    aput-char v18, v1, v5

    const/16 v5, 0xa7

    aput-char v13, v1, v5

    const/16 v5, 0xa8

    const/16 v9, 0x27

    aput-char v9, v1, v5

    const/16 v5, 0x65

    aput-char v5, v1, v12

    const/16 v5, 0xaa

    aput-char v33, v1, v5

    const/16 v5, 0x53

    aput-char v5, v1, v14

    aput-char v32, v1, v31

    const/16 v5, 0xad

    const/16 v9, 0xd0

    aput-char v9, v1, v5

    const/16 v5, 0xae

    const/16 v9, 0xe0

    aput-char v9, v1, v5

    const/16 v5, 0xaf

    const/16 v9, 0x98

    aput-char v9, v1, v5

    const/16 v5, 0xb0

    aput-char v20, v1, v5

    const/16 v5, 0xb1

    aput-char v2, v1, v5

    aput-char v15, v1, v40

    const/16 v5, 0xb3

    const/16 v9, 0x46

    aput-char v9, v1, v5

    const/16 v5, 0xb6

    aput-char v5, v1, v38

    const/16 v5, 0xb5

    const/16 v9, 0x18

    aput-char v9, v1, v5

    const/16 v5, 0xb6

    const/16 v9, 0x91

    aput-char v9, v1, v5

    const/16 v5, 0xb7

    aput-char v39, v1, v5

    const/16 v5, 0xb8

    const/16 v9, 0x98

    aput-char v9, v1, v5

    const/16 v5, 0xb9

    const/16 v9, 0xa1

    aput-char v9, v1, v5

    aput-char v25, v1, v8

    const/16 v5, 0xbb

    const v8, 0xffe7

    aput-char v8, v1, v5

    const/16 v5, 0xbc

    const/16 v8, 0x16

    aput-char v8, v1, v5

    const/16 v5, 0xbd

    aput-char v33, v1, v5

    const/16 v5, 0xbe

    const/16 v8, 0xe7

    aput-char v8, v1, v5

    const/16 v5, 0xbf

    aput-char v16, v1, v5

    const/16 v5, 0xc0

    const v8, 0xfffb

    aput-char v8, v1, v5

    const/16 v5, 0xc1

    aput-char v28, v1, v5

    const/16 v5, 0xc2

    const v8, 0xffeb

    aput-char v8, v1, v5

    const/16 v5, 0xc3

    const/16 v8, 0xb7

    aput-char v8, v1, v5

    const/16 v5, 0xc4

    const/16 v8, 0x2b

    aput-char v8, v1, v5

    const/16 v5, 0xc5

    const/16 v8, 0xc8

    aput-char v8, v1, v5

    const/16 v5, 0xc6

    aput-char v7, v1, v5

    const/16 v5, 0xc7

    aput-char v29, v1, v5

    const/16 v5, 0xc8

    aput-char v34, v1, v5

    const/16 v5, 0xc9

    const/16 v7, 0x53

    aput-char v7, v1, v5

    const/16 v5, 0xca

    const v7, 0xffb4

    aput-char v7, v1, v5

    aput-char v10, v1, v27

    const/16 v5, 0xcc

    const/16 v7, 0xc8

    aput-char v7, v1, v5

    const/16 v5, 0xcd

    const/16 v7, 0x61

    aput-char v7, v1, v5

    const/16 v5, 0xce

    const/16 v7, 0x96

    aput-char v7, v1, v5

    const/16 v5, 0xcf

    const/16 v7, 0x52

    aput-char v7, v1, v5

    const/16 v5, 0xd0

    const/16 v7, 0x34

    aput-char v7, v1, v5

    const/16 v5, 0x6e

    aput-char v5, v1, v22

    const/16 v5, 0xd2

    const/16 v7, 0x2a

    aput-char v7, v1, v5

    const/16 v5, 0xd3

    aput-char v14, v1, v5

    const/16 v5, 0xd4

    const/16 v7, 0x9c

    aput-char v7, v1, v5

    const/16 v5, 0xd5

    const/16 v7, 0x48

    aput-char v7, v1, v5

    const/16 v5, 0xd6

    aput-char v29, v1, v5

    const/16 v5, 0xd7

    const v7, 0xffe2

    aput-char v7, v1, v5

    const/16 v5, 0xd8

    aput-char v31, v1, v5

    const/16 v5, 0xd9

    const/16 v7, 0x4f

    aput-char v7, v1, v5

    aput-char v6, v1, v44

    const/16 v5, 0xbc

    aput-char v5, v1, v17

    const/16 v5, 0xdc

    const/16 v6, 0xb6

    aput-char v6, v1, v5

    const/16 v5, 0xb7

    aput-char v5, v1, v41

    const/16 v5, 0xde

    const/16 v6, 0xbe

    aput-char v6, v1, v5

    const/16 v5, 0xdf

    const/16 v6, 0xc5

    aput-char v6, v1, v5

    const/16 v5, 0xe0

    const/16 v6, 0x8e

    aput-char v6, v1, v5

    const/16 v5, 0xe1

    const/16 v6, 0x5a

    aput-char v6, v1, v5

    const/16 v5, 0xe2

    const v6, 0xffc3

    aput-char v6, v1, v5

    const/16 v5, 0xe3

    const/16 v6, 0x40

    aput-char v6, v1, v5

    const/16 v5, 0xe4

    aput-char v25, v1, v5

    const/16 v5, 0xe5

    const/16 v6, 0x4d

    aput-char v6, v1, v5

    const/16 v5, 0xe6

    aput-char v41, v1, v5

    const/16 v5, 0xe7

    aput-char v34, v1, v5

    const/16 v5, 0xe8

    const/16 v6, 0x6b

    aput-char v6, v1, v5

    const/16 v5, 0xe9

    aput-char v36, v1, v5

    const/16 v5, 0xea

    aput-char v32, v1, v5

    const/16 v5, 0xeb

    const/16 v6, 0xa4

    aput-char v6, v1, v5

    const/16 v5, 0xec

    aput-char v41, v1, v5

    const/16 v5, 0xed

    const/16 v6, 0xf

    aput-char v6, v1, v5

    const/16 v5, 0xee

    aput-char v23, v1, v5

    const/16 v5, 0xef

    const v6, 0xffef

    aput-char v6, v1, v5

    const/16 v5, 0xf0

    const/16 v6, 0x9e

    aput-char v6, v1, v5

    const/16 v5, 0xf1

    const/16 v6, 0x12

    aput-char v6, v1, v5

    const/16 v5, 0xf2

    const/16 v6, 0xbe

    aput-char v6, v1, v5

    const/16 v5, 0xf3

    const/16 v6, 0xc6

    aput-char v6, v1, v5

    const/16 v5, 0xf4

    const/16 v6, 0x90

    aput-char v6, v1, v5

    const/16 v5, 0xf5

    const v6, 0xffea

    aput-char v6, v1, v5

    const/16 v5, 0xf6

    const/16 v6, 0xa7

    aput-char v6, v1, v5

    const/16 v5, 0xf7

    const/16 v6, 0x60

    aput-char v6, v1, v5

    const/16 v5, 0xf8

    aput-char v4, v1, v5

    const/16 v4, 0xf9

    aput-char v3, v1, v4

    const/16 v3, 0xfa

    const/16 v4, 0x77

    aput-char v4, v1, v3

    const/16 v3, 0xfb

    aput-char v42, v1, v3

    const/16 v3, 0xfc

    aput-char v13, v1, v3

    const/16 v3, 0xfd

    const/16 v4, 0x57

    aput-char v4, v1, v3

    const/16 v3, 0xfe

    const/16 v4, 0xdc

    aput-char v4, v1, v3

    const/16 v3, 0xff

    const/16 v4, 0x97

    aput-char v4, v1, v3

    const/16 v3, 0x100

    const/16 v4, 0x3d

    aput-char v4, v1, v3

    const/16 v3, 0x101

    const/16 v4, 0x92

    aput-char v4, v1, v3

    const/16 v3, 0x102

    const/16 v4, 0xb0

    aput-char v4, v1, v3

    const/16 v3, 0x103

    aput-char v27, v1, v3

    const/16 v3, 0x104

    const/16 v4, 0xca

    aput-char v4, v1, v3

    const/16 v3, 0x105

    const/16 v4, 0xb5

    aput-char v4, v1, v3

    const/16 v3, 0x106

    aput-char v30, v1, v3

    const/16 v3, 0x107

    aput-char v12, v1, v3

    const/16 v3, 0x108

    const v4, 0xffe7

    aput-char v4, v1, v3

    .line 1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v4, 0x0

    .line 2
    :goto_0
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v4, v5, :cond_0

    .line 3
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    rem-int/lit16 v6, v4, 0x109

    aget-char v6, v1, v6

    xor-int/2addr v5, v6

    int-to-char v5, v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    new-array v1, v2, [B

    .line 5
    :try_start_1
    new-instance v2, Ljava/lang/String;

    const-string v3, "-\u0006\u0019Uj"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-object v0
.end method


# virtual methods
.method public a(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/ClassLoader;
    .locals 8

    .line 1
    iget-object v0, p0, Lxyz/easypro/ecrypt/utils/a;->a:Landroid/content/Context;

    const-string v1, "\u001d\u0011-\u0001\"+\'=;\u001d*"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/io/File;

    iget-object v3, p0, Lxyz/easypro/ecrypt/utils/a;->a:Landroid/content/Context;

    const-string v4, "\u001d\u0011-\u0001\"+\'6:\u0000"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v3

    invoke-direct {v1, v3, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 3
    iget-object p2, p0, Lxyz/easypro/ecrypt/utils/a;->a:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p2

    iget-object p2, p2, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 4
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    .line 5
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 6
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    :cond_0
    const/4 v3, 0x0

    .line 7
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 8
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 9
    :cond_1
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    :try_start_1
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/high16 v5, 0x500000

    new-array v5, v5, [B

    .line 11
    :goto_0
    invoke-virtual {p1, v5}, Ljava/io/InputStream;->read([B)I

    move-result v6

    const/4 v7, -0x1

    if-eq v6, v7, :cond_2

    .line 12
    invoke-virtual {v3, v5, v2, v6}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 13
    :cond_2
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    .line 14
    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->load([B)[B

    move-result-object v3

    .line 15
    array-length v5, v3

    invoke-virtual {v4, v3, v2, v5}, Ljava/io/FileOutputStream;->write([BII)V

    .line 16
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->flush()V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/b;->a(Ljava/io/Closeable;)V

    .line 18
    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/b;->a(Ljava/io/Closeable;)V

    goto :goto_3

    :catchall_0
    move-exception p2

    move-object v3, v4

    goto :goto_1

    :catch_0
    move-object v3, v4

    goto :goto_2

    :catchall_1
    move-exception p2

    .line 19
    :goto_1
    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/b;->a(Ljava/io/Closeable;)V

    .line 20
    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/b;->a(Ljava/io/Closeable;)V

    .line 21
    throw p2

    .line 22
    :catch_1
    :goto_2
    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/b;->a(Ljava/io/Closeable;)V

    .line 23
    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/b;->a(Ljava/io/Closeable;)V

    .line 24
    :goto_3
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    if-eqz p3, :cond_3

    .line 25
    new-instance p1, Ldalvik/system/DexClassLoader;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p1, v2, v3, p2, p3}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    goto :goto_4

    .line 26
    :cond_3
    new-instance p1, Ldalvik/system/DexClassLoader;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lxyz/easypro/ecrypt/utils/a;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-direct {p1, p3, v2, p2, v3}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    .line 27
    :goto_4
    invoke-virtual {v0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object p2

    invoke-virtual {p0, p2}, Lxyz/easypro/ecrypt/utils/a;->b(Ljava/io/File;)V

    .line 28
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p2

    invoke-virtual {p0, p2}, Lxyz/easypro/ecrypt/utils/a;->b(Ljava/io/File;)V

    return-object p1
.end method

.method public final b(Ljava/io/File;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 2
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 3
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0, v3}, Lxyz/easypro/ecrypt/utils/a;->b(Ljava/io/File;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-void
.end method

.method public d(Ljava/io/InputStream;)Ljava/lang/ClassLoader;
    .locals 5

    const-string v0, "\u0015\u00113\u0019!,4=>\u001c7-"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1
    :try_start_0
    iget-object v3, p0, Lxyz/easypro/ecrypt/utils/a;->b:Ljava/lang/Class;

    invoke-virtual {v3, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    .line 2
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 3
    iget-object v4, p0, Lxyz/easypro/ecrypt/utils/a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ClassLoader;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v3, v2

    :goto_0
    :try_start_1
    const-string v4, "\u001b>>\u000b!:\u000b|;\u001d*"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 4
    invoke-virtual {p0, p1, v4, v3}, Lxyz/easypro/ecrypt/utils/a;->a(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/ClassLoader;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 5
    :try_start_2
    iget-object v3, p0, Lxyz/easypro/ecrypt/utils/a;->b:Ljava/lang/Class;

    invoke-virtual {v3, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 7
    iget-object v1, p0, Lxyz/easypro/ecrypt/utils/a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_1
    return-object p1

    :catch_2
    return-object v2
.end method
