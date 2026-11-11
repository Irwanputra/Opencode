.class public Landroidx/appcompat/widget/SearchView$くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/SearchView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/appcompat/widget/SearchView;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/SearchView;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView$くし〴〺ぅ;->〺つふすそ:Landroidx/appcompat/widget/SearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView$くし〴〺ぅ;->〺つふすそ:Landroidx/appcompat/widget/SearchView;

    iget-object v0, v0, Landroidx/appcompat/widget/SearchView;->えがぐせほち:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;

    instance-of v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;

    if-eqz v1, :cond_c

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/database/Cursor;)V

    :cond_c
    return-void
.end method
