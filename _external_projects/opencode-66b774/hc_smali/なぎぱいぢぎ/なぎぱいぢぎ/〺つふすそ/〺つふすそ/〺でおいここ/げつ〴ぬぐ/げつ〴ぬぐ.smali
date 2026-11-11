.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺でおいここ/げつ〴ぬぐ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final 〺つふすそ:[I

.field public static final げつ〴ぬぐ:[I


# direct methods
.method public static constructor <clinit>()V
    .registers 4

    const/4 v0, 0x2

    new-array v0, v0, [I

    const/high16 v1, 0x1010000

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->theme:I

    const/4 v3, 0x1

    aput v1, v0, v3

    sput-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺でおいここ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:[I

    new-array v0, v3, [I

    sget v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->materialThemeOverlay:I

    aput v1, v0, v2

    sput-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺でおいここ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[I

    return-void
.end method

.method public static げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;
    .registers 6

    .line 1
    sget-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺でおいここ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:[I

    invoke-virtual {p0, p1, v0, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p2, p3, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 2
    instance-of p2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;

    const/4 v1, 0x1

    if-eqz p2, :cond_1c

    move-object p2, p0

    check-cast p2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;

    .line 3
    iget p2, p2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->げつ〴ぬぐ:I

    if-ne p2, v0, :cond_1c

    const/4 p2, 0x1

    goto :goto_1d

    :cond_1c
    const/4 p2, 0x0

    :goto_1d
    if-eqz v0, :cond_46

    if-eqz p2, :cond_22

    goto :goto_46

    .line 4
    :cond_22
    new-instance p2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;

    invoke-direct {p2, p0, v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;-><init>(Landroid/content/Context;I)V

    .line 5
    sget-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺でおいここ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:[I

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p0

    invoke-virtual {p0, p3, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    invoke-virtual {p0, v1, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p1, :cond_3b

    goto :goto_3c

    :cond_3b
    move p1, p3

    :goto_3c
    if-eqz p1, :cond_45

    .line 6
    invoke-virtual {p2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    invoke-virtual {p0, p1, v1}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_45
    return-object p2

    :cond_46
    :goto_46
    return-object p0
.end method
