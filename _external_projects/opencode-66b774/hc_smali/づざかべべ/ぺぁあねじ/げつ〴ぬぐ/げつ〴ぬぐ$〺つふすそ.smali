.class public Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ$〺つふすそ;
.super Landroid/database/DataSetObserver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;


# direct methods
.method public constructor <init>(Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ$〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .registers 3

    iget-object v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ$〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Z

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public onInvalidated()V
    .registers 3

    iget-object v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ$〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Z

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    return-void
.end method
