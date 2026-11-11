.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$げつ〴ぬぐ;
.super Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/くし〴〺ぅ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public くし〴〺ぅ:Z


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    invoke-direct {p0, p1}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/くし〴〺ぅ;-><init>(Landroid/graphics/drawable/Drawable;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$げつ〴ぬぐ;->くし〴〺ぅ:Z

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .registers 3

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$げつ〴ぬぐ;->くし〴〺ぅ:Z

    if-eqz v0, :cond_9

    .line 1
    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/くし〴〺ぅ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_9
    return-void
.end method

.method public setHotspot(FF)V
    .registers 4

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$げつ〴ぬぐ;->くし〴〺ぅ:Z

    if-eqz v0, :cond_9

    .line 1
    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/くし〴〺ぅ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, p1, p2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->のびぶけせ(Landroid/graphics/drawable/Drawable;FF)V

    :cond_9
    return-void
.end method

.method public setHotspotBounds(IIII)V
    .registers 6

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$げつ〴ぬぐ;->くし〴〺ぅ:Z

    if-eqz v0, :cond_9

    .line 1
    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/くし〴〺ぅ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, p1, p2, p3, p4}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぇいうげ〱〹(Landroid/graphics/drawable/Drawable;IIII)V

    :cond_9
    return-void
.end method

.method public setState([I)Z
    .registers 3

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$げつ〴ぬぐ;->くし〴〺ぅ:Z

    if-eqz v0, :cond_b

    .line 1
    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/くし〴〺ぅ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    return p1

    :cond_b
    const/4 p1, 0x0

    return p1
.end method

.method public setVisible(ZZ)Z
    .registers 4

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻$げつ〴ぬぐ;->くし〴〺ぅ:Z

    if-eqz v0, :cond_9

    invoke-super {p0, p1, p2}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/くし〴〺ぅ;->setVisible(ZZ)Z

    move-result p1

    return p1

    :cond_9
    const/4 p1, 0x0

    return p1
.end method
