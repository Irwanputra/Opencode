.class public Lづざかべべ/は〲ぱなで/せづっ〸ちね;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final 〺つふすそ:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static final くし〴〺ぅ:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation
.end field

.field public static final げつ〴ぬぐ:Lづざかべべ/は〲ぱなで/げがぴうあだ;


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_c

    new-instance v0, Lづざかべべ/は〲ぱなで/ぇとしたべど;

    invoke-direct {v0}, Lづざかべべ/は〲ぱなで/ぇとしたべど;-><init>()V

    goto :goto_39

    :cond_c
    const/16 v1, 0x17

    if-lt v0, v1, :cond_16

    new-instance v0, Lづざかべべ/は〲ぱなで/〺でおいここ;

    invoke-direct {v0}, Lづざかべべ/は〲ぱなで/〺でおいここ;-><init>()V

    goto :goto_39

    :cond_16
    const/16 v1, 0x16

    if-lt v0, v1, :cond_20

    new-instance v0, Lづざかべべ/は〲ぱなで/おかぷせ〱;

    invoke-direct {v0}, Lづざかべべ/は〲ぱなで/おかぷせ〱;-><init>()V

    goto :goto_39

    :cond_20
    const/16 v1, 0x15

    if-lt v0, v1, :cond_2a

    new-instance v0, Lづざかべべ/は〲ぱなで/けときぜと;

    invoke-direct {v0}, Lづざかべべ/は〲ぱなで/けときぜと;-><init>()V

    goto :goto_39

    :cond_2a
    const/16 v1, 0x13

    if-lt v0, v1, :cond_34

    new-instance v0, Lづざかべべ/は〲ぱなで/ぷぞてのほき;

    invoke-direct {v0}, Lづざかべべ/は〲ぱなで/ぷぞてのほき;-><init>()V

    goto :goto_39

    :cond_34
    new-instance v0, Lづざかべべ/は〲ぱなで/げがぴうあだ;

    invoke-direct {v0}, Lづざかべべ/は〲ぱなで/げがぴうあだ;-><init>()V

    :goto_39
    sput-object v0, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->げつ〴ぬぐ:Lづざかべべ/は〲ぱなで/げがぴうあだ;

    new-instance v0, Lづざかべべ/は〲ぱなで/せづっ〸ちね$げつ〴ぬぐ;

    const-class v1, Ljava/lang/Float;

    const-string v2, "translationAlpha"

    invoke-direct {v0, v1, v2}, Lづざかべべ/は〲ぱなで/せづっ〸ちね$げつ〴ぬぐ;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->〺つふすそ:Landroid/util/Property;

    new-instance v0, Lづざかべべ/は〲ぱなで/せづっ〸ちね$〺つふすそ;

    const-class v1, Landroid/graphics/Rect;

    const-string v2, "clipBounds"

    invoke-direct {v0, v1, v2}, Lづざかべべ/は〲ぱなで/せづっ〸ちね$〺つふすそ;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->くし〴〺ぅ:Landroid/util/Property;

    return-void
.end method

.method public static 〺つふすそ(Landroid/view/View;)Lづざかべべ/は〲ぱなで/えがぐせほち;
    .registers 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_c

    new-instance v0, Lづざかべべ/は〲ぱなで/ち〴みぎ〻び;

    invoke-direct {v0, p0}, Lづざかべべ/は〲ぱなで/ち〴みぎ〻び;-><init>(Landroid/view/View;)V

    return-object v0

    :cond_c
    new-instance v0, Lづざかべべ/は〲ぱなで/ておぞぞはね;

    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p0

    invoke-direct {v0, p0}, Lづざかべべ/は〲ぱなで/ておぞぞはね;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method

.method public static くし〴〺ぅ(Landroid/view/View;IIII)V
    .registers 11

    sget-object v0, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->げつ〴ぬぐ:Lづざかべべ/は〲ぱなで/げがぴうあだ;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lづざかべべ/は〲ぱなで/げがぴうあだ;->づざかべべ(Landroid/view/View;IIII)V

    return-void
.end method

.method public static げつ〴ぬぐ(Landroid/view/View;)F
    .registers 2

    sget-object v0, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->げつ〴ぬぐ:Lづざかべべ/は〲ぱなで/げがぴうあだ;

    invoke-virtual {v0, p0}, Lづざかべべ/は〲ぱなで/げがぴうあだ;->〺つふすそ(Landroid/view/View;)F

    move-result p0

    return p0
.end method
