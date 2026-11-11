.class public Lcom/androidnetworking/widget/ANImageView$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$づざかべべ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/androidnetworking/widget/ANImageView;->くし〴〺ぅ(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lcom/androidnetworking/widget/ANImageView;

.field public final synthetic げつ〴ぬぐ:Z


# direct methods
.method public constructor <init>(Lcom/androidnetworking/widget/ANImageView;Z)V
    .registers 3

    iput-object p1, p0, Lcom/androidnetworking/widget/ANImageView$げつ〴ぬぐ;->〺つふすそ:Lcom/androidnetworking/widget/ANImageView;

    iput-boolean p2, p0, Lcom/androidnetworking/widget/ANImageView$げつ〴ぬぐ;->げつ〴ぬぐ:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;Z)V
    .registers 4

    if-eqz p2, :cond_11

    iget-boolean p2, p0, Lcom/androidnetworking/widget/ANImageView$げつ〴ぬぐ;->げつ〴ぬぐ:Z

    if-eqz p2, :cond_11

    iget-object p2, p0, Lcom/androidnetworking/widget/ANImageView$げつ〴ぬぐ;->〺つふすそ:Lcom/androidnetworking/widget/ANImageView;

    new-instance v0, Lcom/androidnetworking/widget/ANImageView$げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-direct {v0, p0, p1}, Lcom/androidnetworking/widget/ANImageView$げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Lcom/androidnetworking/widget/ANImageView$げつ〴ぬぐ;Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;)V

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 1
    :cond_11
    iget-object p1, p1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_1b

    .line 2
    iget-object p2, p0, Lcom/androidnetworking/widget/ANImageView$げつ〴ぬぐ;->〺つふすそ:Lcom/androidnetworking/widget/ANImageView;

    invoke-virtual {p2, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_24

    :cond_1b
    iget-object p1, p0, Lcom/androidnetworking/widget/ANImageView$げつ〴ぬぐ;->〺つふすそ:Lcom/androidnetworking/widget/ANImageView;

    .line 3
    iget p2, p1, Lcom/androidnetworking/widget/ANImageView;->づざかべべ:I

    if-eqz p2, :cond_24

    .line 4
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    :cond_24
    :goto_24
    return-void
.end method
