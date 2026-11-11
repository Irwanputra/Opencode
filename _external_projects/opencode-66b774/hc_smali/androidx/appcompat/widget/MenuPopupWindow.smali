.class public Landroidx/appcompat/widget/MenuPopupWindow;
.super Landroidx/appcompat/widget/ListPopupWindow;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぉざぅち〻/ざっざへづ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;
    }
.end annotation


# static fields
.field public static ぺづげぺが:Ljava/lang/reflect/Method;


# instance fields
.field public じぜこほぱ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ざっざへづ;


# direct methods
.method public static constructor <clinit>()V
    .registers 5

    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-gt v0, v1, :cond_18

    const-class v0, Landroid/widget/PopupWindow;

    const-string v1, "setTouchModal"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Landroidx/appcompat/widget/MenuPopupWindow;->ぺづげぺが:Ljava/lang/reflect/Method;
    :try_end_18
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_18} :catch_18

    :catch_18
    :cond_18
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 5

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/appcompat/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method


# virtual methods
.method public ぇぬぎばつ(Landroid/content/Context;Z)Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;
    .registers 4

    new-instance v0, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;

    invoke-direct {v0, p1, p2}, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;-><init>(Landroid/content/Context;Z)V

    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/MenuPopupWindow$MenuDropDownListView;->setHoverListener(Lづざかべべ/〺つふすそ/ぉざぅち〻/ざっざへづ;)V

    return-object v0
.end method

.method public くし〴〺ぅ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Landroid/view/MenuItem;)V
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/MenuPopupWindow;->じぜこほぱ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ざっざへづ;

    if-eqz v0, :cond_7

    invoke-interface {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ざっざへづ;->くし〴〺ぅ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Landroid/view/MenuItem;)V

    :cond_7
    return-void
.end method

.method public びぐびあび(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Landroid/view/MenuItem;)V
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/MenuPopupWindow;->じぜこほぱ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ざっざへづ;

    if-eqz v0, :cond_7

    invoke-interface {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ざっざへづ;->びぐびあび(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Landroid/view/MenuItem;)V

    :cond_7
    return-void
.end method
